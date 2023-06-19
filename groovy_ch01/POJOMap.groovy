def map2 = [ : ]
map2.key1 = "name"
map2[map2.key1] = "hahaha"
println (map2.key1 +" :"  + map2[map2.key1])


map2[30] = "thirty"
println(map2.get(30))