

def dateSubString(String yyyymmdd, String sep){
  def returnDate = ""
  if(yyyymmdd.length() == 8){
    returnDate = yyyymmdd.substring(0,4) + sep + yyyymmdd.substring(4,6) + sep + yyyymmdd.substring(6,8)
  }
  return returnDate
}

println dateSubString("20230627", "/")