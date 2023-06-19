def map = [key1 : "value1",  key2 : "value2"]

def key1 = "whateverKey"
def otherMap = [ (key1) : "whateverValue" ]
def emptyMap = [:]
map["key1"] = "anotherValue1"
println map["key1"]