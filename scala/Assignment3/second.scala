object second{

def prime(p:Int,n:Int=2):Boolean= n match {
case x if(x==p) => true
case x if GCD(p,x)>1 => false
case x => prime(p,x+1)
}

def primeSeq(n:Int):Unit={
if (prime(n)) println(n);
if(n>0) primeSeq(n-1);
}

def GCD(a:Int,b:Int):Int=b match{
case 0 => a
case x if x>a => GCD(x,a)
case x => GCD(x,a%x)
}

def main(args: Array[String]){
primeSeq(10);
//println(prime(5));

}

}