val limitMonth=600_000
val limitDay=150_000
val minCommissionVisa=35
val commissionVisa=0.0075
val commissionMastercard=0.006
val commissionFixMastercard=20
val commissionLimitMastercard=75000
val commissionMinMastercard=300
var sumDay:Int=0;
fun main(){
    var sum=45000
    var sumMonth=50_000
    if (sum+sumDay<limitDay){
        if (sum+sumMonth<limitMonth)
        println("Комиссия составит: "+commission("mastercard",sum=sum, sumMonth = sumMonth))
        else println("Превышен месячный лимит")
    }
    else println("Превышен дневной лимит")
}

fun commission(typeCard:String="mir",sumMonth:Int=0, sum:Int):Int{
   return     when (typeCard){
        "VKPay"->0
        "visa", "mir"->if(sum*commissionVisa<minCommissionVisa) minCommissionVisa else (sum*commissionVisa).toInt()
        "mastercard","maestro"-> if (sum+sumMonth<commissionLimitMastercard && (sum>commissionMinMastercard)) 0 else
            if(sumMonth>=commissionLimitMastercard || sum<commissionMinMastercard) (sum*commissionMastercard+commissionFixMastercard).toInt()
            else {
            ((sum+sumMonth-commissionLimitMastercard)*commissionMastercard+commissionFixMastercard).toInt() }

        else->0
        }
   }

