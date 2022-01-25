package com.dicoding.kotlin.oop

class kalkulator{
    fun tambah(value1:Int, value2:Int ): Int {
        return value1+value2
    }
    fun tambah(value1: Int,value2: Int,value3:Int)=value1+value2+value3

    fun tambah(value1: Int,value2: Int,value3:Int,value4:Int): Int {
        if(value1>value2 && value3>value4){
            return value1-value2+value3-value4//kalau ga di return maka akan mereturn alamat
        }
        else{
            return value2-value1+value4-value3
        }
    }
}
fun main(){
    val cal_obj =kalkulator()
    println(cal_obj.tambah(10,20))
    println(cal_obj.tambah(10,20,30))
    println(cal_obj.tambah(10,20,30,40))
}