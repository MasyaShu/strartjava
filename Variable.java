public class Variable{	
    public static void main(String[] args) {
    	byte numcores = 6;
    	short nummonitor = 2;
    	int nummemorymb = 16384;
    	long nummemorykb = 16777216;
    	float monitordiagonalinch = 23.8f;
    	double monitordiagonalcm = 60.452d;
    	char proc = 'A';
    	boolean goodcomputer = true;

        System.out.println("Количество ядер: " + numcores);
        System.out.println("Количество мониторов: " + nummonitor);
        System.out.println("Количество оперативной памяти Mb: " + nummemorymb);
        System.out.println("Количество оперативной памяти Kb: " + nummemorykb);
        System.out.println("Диагональ монитора дюйм: " + monitordiagonalinch);
        System.out.println("Диагональ монитора см: " + monitordiagonalcm);
        System.out.println("Первая буква производителя процессора: " + proc);
        System.out.println("Это хороший компьютер? : " + goodcomputer);

    }
}