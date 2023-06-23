def map = ["이름" : "하하하", "나이" : 29, "지역" : "서울"]

if(map.get("직업")){
  println "내용이 실행됨. 즉 null도 true"
}else{
  println "응 null은 false야~"
}

println map.get("이름")