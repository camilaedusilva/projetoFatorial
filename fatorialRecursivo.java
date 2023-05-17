public class calcularFatorialRecursivo{
	public static int calcularFatorialRecursivo(int n) throws IllegalArgumentException{
		if (n==0)
			return 1;
		return n * calcularFatorialRecursivo(n-1)
	}

	public static void maind(string[] args){
		system.out.println(calcularFaotiralRecursivo(5));
	}
}