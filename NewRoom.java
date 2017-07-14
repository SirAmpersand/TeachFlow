import java.io.IOException;
import java.io.PrintWriter;

public class NewRoom {
String name;
String stunames[];
String gradeFin;
int numstu;
int arraystu[];
int len;
int neg;
int gradeNum;
public void saveRoom() {
	try {
		PrintWriter write = new PrintWriter(name + ".crf");
		write.println(name);
		write.println(numstu);
		len = stunames.length;
		neg = len - len;
		do {
			write.println(stunames[neg]);
			neg++;
		}while(neg < len);
		write.close();
	}catch(IOException e) {
		
	}

	}

public String setName(String a){
	name = a;
	return name;
}

public int getLength() {
	int b = arraystu.length;
	return b;
}

public String[] setStuNames(String x[]) {
	stunames = x;
	return stunames;
}

public int setGradeNum(int x) {
	gradeNum = x;
	return gradeNum;
}

public String setGradeFin() {
	//TODO force a number between 1 and 12, no zeroes or 13+
if(gradeNum == 1) {
	gradeFin = (gradeNum + "st Grade");
}
else if(gradeNum == 2) {
	gradeFin = (gradeNum + "nd Grade");
}
else if(gradeNum == 3) {
	gradeFin = (gradeNum + "rd Grade");
}
else {
	gradeFin = (gradeNum + "th Grade");
}
return gradeFin;
}

public void printGradeFin() {
	System.out.println(gradeFin);
}
}
