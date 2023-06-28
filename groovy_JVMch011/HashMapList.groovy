def mapList = [["name" : "hahaha", "age" : 90], ["name" : "hhj", "age" : 30],["name" : "kim", "age" : 10]]
println(mapList.find({it ->  it.name == "hahaha"}))
