package baconAlphabet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaconAlphabetMain {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose option a or b");
		System.out.println("a. encrypt a message or b. decrypt a message");
		String optionAorB = in.nextLine();
		if (optionAorB.equals("a")) {
			System.out.println("what message do you want to encrypt?");
			String messageToEncrypt = in.nextLine();
			in.close();
			String[] msgChar = null;
			List<String> newMsg = new ArrayList<String>();
			String completMs = null;
			String newSS = null;
			for (int i = 0; i < messageToEncrypt.length(); i++) {
				msgChar = messageToEncrypt.split("");
				newMsg.add(traductMessage(msgChar[i]));
				completMs = newMsg.get(i);
				newSS += completMs;
			}
			System.out.println(newSS);

		}
		if (optionAorB.equals("b")) {
			System.out.println("what message do you want to decrypt?");
			String messageToDecrypt = in.nextLine();
			in.close();
			String[] msgChar = null;
			List<String> decryMsg = new ArrayList<String>();
			String completMsg = null;
			String newSS = null;
			List<String> list = new ArrayList<String>();
			int index = 0;
			String decrypted = null;
			while (index < messageToDecrypt.length()) {
				list.add(messageToDecrypt.substring(index, Math.min(index + 5, messageToDecrypt.length())));
				index = index + 5;

				for (int i = 0; i < list.size(); i++) {
					String toDecrypt = list.get(i);
					decrypted += decryptMessage(toDecrypt);
				}
			}
			System.out.println(decrypted);
		}
	}

	private static String decryptMessage(String toDecrypt) {
		switch (toDecrypt) {
		case "AAAAA":
			return Alphabet.getA();
		case "AAAAB":
			return Alphabet.getB();
		case "AAABA":
			return Alphabet.getC();
		case "AAABB":
			return Alphabet.getD();
		case "AABAA":
			return Alphabet.getE();
		case "AABAB":
			return Alphabet.getF();
		case "AABBA":
			return Alphabet.getG();
		case "AABBB":
			return Alphabet.getH();
		case "ABAAA":
			return Alphabet.getI();
		case "ABAAB":
			return Alphabet.getK();
		case "ABABA":
			return Alphabet.getL();
		case "ABABB":
			return Alphabet.getM();
		case "ABBAA":
			return Alphabet.getN();
		case "ABBAB":
			return Alphabet.getO();
		case "ABBBA":
			return Alphabet.getP();
		case "ABBBB":
			return Alphabet.getQ();
		case "BAAAA":
			return Alphabet.getR();
		case "BAAAB":
			return Alphabet.getS();
		case "BAABA":
			return Alphabet.getT();
		case "BAABB":
			return Alphabet.getV();
		case "BABAA":
			return Alphabet.getW();
		case "BABAB":
			return Alphabet.getX();
		case "BABBA":
			return Alphabet.getY();
		case "BABBB":
			return Alphabet.getZ();
		default:
			return "";
		}
	}

	private static String traductMessage(String string) {
		// TODO Auto-generated method stub
		// System.out.println(string);
		switch (string) {
		case "a":
			return Alphabet.setA(string);
		case "b":

			return Alphabet.setB(string);
		case "c":
			return Alphabet.setC(string);
		// System.out.println("in c");
		case "d":
			return Alphabet.setD(string);

		case "e":
			return Alphabet.setE(string);
		case "f":
			return Alphabet.setF(string);

		case "g":
			return Alphabet.setG(string);

		case "h":
			return Alphabet.setH(string);

		case "i":
			return Alphabet.setI(string);

		case "j":
			return Alphabet.setJ(string);

		case "k":
			return Alphabet.setK(string);

		case "l":
			return Alphabet.setL(string);

		case "m":
			return Alphabet.setM(string);

		case "n":
			return Alphabet.setN(string);

		case "o":
			return Alphabet.setO(string);

		case "p":
			return Alphabet.setP(string);

		case "q":
			return Alphabet.setQ(string);

		case "r":
			return Alphabet.setR(string);

		case "s":
			return Alphabet.setS(string);

		case "t":
			return Alphabet.setT(string);

		case "u":
			return Alphabet.setU(string);

		case "v":
			return Alphabet.setV(string);

		case "w":
			return Alphabet.setW(string);

		case "x":
			return Alphabet.setX(string);

		case "y":
			return Alphabet.setY(string);

		case "z":
			return Alphabet.setZ(string);

		default:
			return "00000";
		}
	}

}
