public class Variable {	
    public static void main(String[] args) {
    	byte numCores = 6;
    	short numMonitor = 2;
    	int numMemoryMb = 16384;
    	long numMemoryKb = 16777216;
    	float monitorDiagonalInch = 23.8f;
    	double monitorDiagonalCm = 60.452d;
    	char proc = 'A';
    	boolean isGoodComputer = true;

        System.out.println("Количество ядер: " + numCores);
        System.out.println("Количество мониторов: " + numMonitor);
        System.out.println("Количество оперативной памяти Mb: " + numMemoryMb);
        System.out.println("Количество оперативной памяти Kb: " + numMemoryKb);
        System.out.println("Диагональ монитора дюйм: " + monitorDiagonalInch);
        System.out.println("Диагональ монитора см: " + monitorDiagonalCm);
        System.out.println("Первая буква производителя процессора: " + proc);
        System.out.println("Это хороший компьютер? : " + isGoodComputer);
    }
}