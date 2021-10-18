///////////////////////////////////////////////////////////////question1
fun main(){
//create 3 elements
  var manalFavCity= mutableListOf("manama,jeddah,baha,")
//add more 2 elements
  manalFavCity.add(0,"riyadh")
  manalFavCity.add(1,"ciro")

//update the last element
  var isFound=manalFavCity.contains("baha")
  println("baha")
  println(manalFavCity)
}
/////////////////////////////////////////////////////////////////question 2
fun main(){
  //create int list
  var manalIntList = mutableListOf(3,4,6,8,0)

  //update the 3rd to 12
  manalIntList [2]=12
  //check if 12existing
  var isFound=manalIntList.contains(12)
 // delete element
  manalIntList.removeAt(2)
  //print the list
  println( manalIntList)
}
/////////////////////////////////////////////////////////////////question 3 (options)
import java.io.file

fun main(){
  //create int list
  var manalIntList = mutableListOf(3,4,6,8,0)

  //update the 3rd to 12
  manalIntList [2]=12
  //check if 12existing
  var isFound=manalIntList.contains(12)
  // delete element
  manalIntList.removeAt(2)
  //print the list
  println( manalIntList)
  var filemanalIntList=File("path name").readText(.split"/n")
  println (filemanalIntList)
}



