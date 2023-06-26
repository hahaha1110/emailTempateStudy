// def list = [11, 12, 13, 14];
// list.each {println it}


// println list.size()
// String ymdhmss = new Date().format("yyyy-MM-dd HH:mm:ss")
// println ymdhmss
// def date = new Date()
// println date.format("yyyyMMdd")
// println date.format("yyyy/MM/dd")

// // groovy 특정날짜 지정하는법,,
// def ymdhms = Date.parse("yyyyMMddHHmmss", "20230626133901");
// println ymdhms.format("yyyy-MM-dd HH:mm:ss")

// def ymd = Date.parse("yyyyMMdd", "20230626")
// println  Date.parse("yyyyMMdd", "20230626").format("yyyy-MM-dd")
def date = new Date()
println date.format("yyyyMMdd")
println date.format("yyyy/MM/dd")
// println new Date().format("yyyyMMdd")
// println new Date().format("yyyy/MM/dd")