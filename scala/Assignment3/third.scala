object third{

def sum(n:Int):Int={

if(n == 1) 1
else sum(n-1) + n;

}
def main(args: Array[String]){

println(sum(5));
}


}