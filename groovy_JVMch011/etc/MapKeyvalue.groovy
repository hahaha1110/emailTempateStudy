def map = ["name" : "hahaha", "age" : 90]

map.each({
  println("$it.key --> $it.value")
})

println(map.find({k, v -> k == "name" && v == "hahaha"}))

println(map.find({k, v -> k == "key1" && v == "value1"}))

