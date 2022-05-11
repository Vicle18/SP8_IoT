from paho.mqtt import client as mqtt_client
class Sensor:
    currentState = ""
    def __init__(self, name, states, variable, actuator):
        self.name = name
        self.states = states
        self.variable = variable
        self.actuator = actuator
    def updateSensor(self, variable, client):
        self.variable = variable
        ruleCheck(variable, self, client, self.states)
    def updateSensorState(self, state, client):
        theKey = next(iter(state))
        self.currentState = theKey
        publish(client, self.actuator, state.get(self.currentState))

broker = 'localhost'
port = 1883
topic1 = "temp"
topic2 = "humidity"
topic3 = "co2"
topic4 = "moisture"
client_id = 'python-mqtt-rulechecker'
username = 'my_user'
password = 'bendevictor'
manual = 0
sensors = []
def connect_mqtt() -> mqtt_client:
    def on_connect(client, userdata, flags, rc):
        if rc == 0:
            print("Connected to MQTT Broker!")
        else:
            print("Failed to connect, return code %d\n", rc)

    client = mqtt_client.Client(client_id)
    client.username_pw_set(username, password)
    client.on_connect = on_connect
    client.connect(broker, port)
    return client


def subscribe(client: mqtt_client, sensor):
    def on_message(client, userdata, msg):
        print(f"Received `{msg.payload.decode()}` from `{msg.topic}` topic")
        for s in sensors:
            if s.name == msg.topic:
                s.updateSensor(msg.payload.decode(), client)
        #ruleCheck(msg.payload.decode(), msg.topic, client)
    client.subscribe(sensor.name)
    client.on_message = on_message

def publish(client,topic, message):
    msg = message
    if manual == 0:
        result = client.publish(topic, msg)
        # result: [0, 1]
        status = result[0]
        if status == 0:
            print(f"Send `{msg}` to topic `{topic}`")
        else:
            print(f"Failed to send message to topic {topic}")
    

def ruleCheck(value, sensor, client,states):
    if sensor.name == "manual":
        global manual 
        manual = int(value)
    if sensor.name == "greenify/tomatoes/moistSensor":
        if float(value)  > 1000:
            sensor.updateSensorState(states[0],client)
        elif float(value) > 500 and float(value) < 1000:
            sensor.updateSensorState(states[1],client)
        elif float(value)  < 500:
            sensor.updateSensorState(states[2],client)
    if sensor.name == "greenify/tempSensor":
        if float(value)  > 40:
            sensor.updateSensorState(states[0],client)
        elif float(value) > 25 and float(value) < 40:
            sensor.updateSensorState(states[1],client)
        elif float(value)  < 25:
            sensor.updateSensorState(states[2],client)
    return

def run():
    client = connect_mqtt()
    manualState = Sensor("manual", None, 0, None)
    t1 = Sensor("greenify/tomatoes/moistSensor", [{"moist":"stop"}, {"optimal":"stop"}, {"dry":"start"}], 0, "greenify/tomatoes/pump")
    t2 = Sensor("greenify/tempSensor", [{"hot":"max"}, {"optimal":"min"}, {"cold":"stop"}], 0, "greenify/fan")
    sensors.append(manualState)
    sensors.append(t1)
    sensors.append(t2)
    subscribe(client, t1)
    subscribe(client, t2)
    subscribe(client, manualState)
    client.loop_forever()

if __name__ == '__main__':
    run()