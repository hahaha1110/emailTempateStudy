import java.text.DecimalFormat 

def num = 1000000

def df = new DecimalFormat("#,###.0")
def formatted = df.format(num)

println "formatted: ${formatted}"
