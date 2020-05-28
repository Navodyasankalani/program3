object five{

def main(args: Array[String]){

println(evensum(8));
}


def evensum(n:Int):Int={

if(n==1){
return 0;
}
else if(n%2==1){
evensum(n-1);
}
else{
n+evensum(n-1);
}

}

}