
// def map = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]

// map.each {it -> println it.value.substring(2) }

Map<String,Object> hashMap  = new HashMap<>();
hashMap.put("key1", "20230622"); 

println hashMap.get("key1").substring(0,4)

// map.each {println it}
// map.each {println "${it.key} maps to : ${it.value}"}
// def ymdTest = "20230621"

// println "${ymdTest.substring(0,4)}- ${ymdTest.substring(4,6)}- ${ymdTest.substring(6)} "