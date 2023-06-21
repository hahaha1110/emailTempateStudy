
def map = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]

// map.each {println it}

// map.each {println "${it.key} maps to : ${it.value}"}

def ymdTest = "20230621"

println "${ymdTest.substring(0,4)}- ${ymdTest.substring(4,6)}- ${ymdTest.substring(6)} "