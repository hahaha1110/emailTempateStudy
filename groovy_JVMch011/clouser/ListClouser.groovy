// def list = [11, 12, 13, 14];
// list.each {println it}


// println list.size()
// String ymdhmss = new Date().format("yyyy-MM-dd HH:mm:ss")
// println ymdhmss
// def date = new Date()
// println date.format("yyyyMMdd")
// println date.format("yyyy/MM/dd")

// groovy 특정날짜 지정하는법,,
// def ymdhms1 = Date.parse("yyyyMMddHHmmss", "20230626133901");
// def ymd1 = Date.parse("yyyy-MM-dd", "20230626");
// def hms1 = Date.parse("HH:mm:ss", "133901");
// println ymdhms.format("yyyy-MM-dd HH:mm:ss")

// def ymd = Date.parse("yyyyMMdd", "20230626")
// println ymd..format("yyyy-MM-dd")
// println  Date.parse("yyyyMMdd", "20230626").format("yyyy-MM-dd")
// def date = new Date()
// println date.format("yyyyMMdd")
// println date.format("yyyy/MM/dd")
// println new Date().format("yyyyMMdd")
// println new Date().format("yyyy/MM/dd")

// String ymdhmss = new Date().format("yyyy-MM-dd HH:mm:ss") 

// def ymdTest =  ("20230626"+""+("133901".substring(0,6))).trim();
// String ymdHms = Date.parse("yyyyMMddHHmmss", ymdTest).format("yyyy-MM-dd HH:mm:ss")
// String test1 = "하하하"
// String test2 = "하하하"

// println test1 == test2

// println ymdHms

String ymdHms = Date.parse("yyyyMMddHHmmss", "20230627101530").format("yyyy-MM-dd HH:mm:ss");
String ymd = Date.parse("yyyyMMddHHmmss", "20230627101530").format("yyyy-MM-dd");
String hms = Date.parse("yyyyMMddHHmmss", "20230627101530").format("HH:mm:ss");

println "ymdHms ===> ${ymdHms} "
println "ymd ===> ${ymd} "
println "hms ===> ${hms} "

// def mapTest = ["tes1" : "haha1", "test2" : "haha2"]
// mapTest.put("test3", mapTest.get("test2")+"hhh")

// println mapTest.get("test3")

// 없는 값 가져왔을때 ,,, 어케되는지?
// println mapTest.get("test8")
println  Date.parse("yyyyMMddHHmmss", "20230627172501").format("yyyy-MM-dd")