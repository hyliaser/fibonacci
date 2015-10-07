class Fibonacci{

public long fib(long i){

  if (i<=3) {
    return 1;
  }
  else{
    return (fib(i-1))+(fib(i-2));
  }

}}