package p439;

public class PopGrowthTest {
	public static void main(String[] args) {
		PopGrowth p1 = new PopGrowth(76, 1.1);
		
		System.out.println("���� ������ �α��� "+p1.getPopulation()+"��� �Դϴ�.");
		System.out.printf("���� ���� �α� �������� %f%% �Դϴ�.%n%n", p1.getGrowthRate());
		
		System.out.println("************************");
		System.out.println("*year*  �α�(��) * ����(��)*");
		System.out.println("************************");
		for(int i = 1; i < 76; i++){
			double growth = p1.nextWorldPop(i) - p1.nextWorldPop(i-1);
			System.out.printf("* %2d * %7.3f * %5.3f *%n",i, p1.nextWorldPop(i), growth);
		}
		System.out.println("************************");
		p1.findDoublePop();
	}

}
