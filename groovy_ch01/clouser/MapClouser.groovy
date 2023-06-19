def map = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]

map.each {println it}

map.each {println "${it.key} maps to : ${it.value}"}


