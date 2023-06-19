def lst = [1, 2, 3, 4]
lst.each {println it}
println ("The list will only display thise numbers which are divisivle by 2")
lst.each { num -> if(num % 2 ==0) println num}