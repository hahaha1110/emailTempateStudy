def list = [10, 20, 30, 40, 50]
list.each({
    def bar = "X" * it
    println "${bar} ${it}"
})