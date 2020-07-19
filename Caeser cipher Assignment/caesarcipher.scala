object caesarcipher extends App{

  print("Enter Sting: ")
  val s=scala.io.StdIn.readLine()
  print("Enter number of shifts: ")
  val shifts=scala.io.StdIn.readInt()
  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
  val decrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)
  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

  val ct=cipher(encrypt,s,shifts,alphabet)
  val cp=cipher(decrypt,ct,shifts,alphabet)

  println("After Encrypt the string : "+ct)
  println("After Decrypt the encrypted string : "+cp)

}
