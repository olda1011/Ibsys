package application;

import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBElement;

import generated.Results;
import generated.Results.Ordersinwork;
import generated.Results.Waitinglistworkstations.Workplace;
import generated.Results.Waitinglistworkstations.Workplace.Waitinglist;
import generated.Results.Warehousestock.Article;

public class Main {

	public static void main(String[] args) {
		InputStream resultData = Main.class.getResourceAsStream("resultservlet.xml");
		Results results = JAXB.unmarshal(resultData, Results.class);

		int geplanterLagerbestand = 50;
		int geplantVerkaufP1 = 150;
		int geplantVerkaufP2 = 250;
		int geplantVerkaufP3 = 100;

		System.out.println("Folgende Mengen sollen verkauft werden in der nächsten Periode:\n");
		System.out.println("P1: " + geplantVerkaufP1);
		System.out.println("P2: " + geplantVerkaufP2);
		System.out.println("P3: " + geplantVerkaufP3);
		System.out.println();
		System.out.println("Der geplante Lagerbestand beträgt: " + geplanterLagerbestand);
		System.out.println();

		// Matrix anlegen

		final int[][] P1Prod = matrixAnlegen(geplanterLagerbestand, geplantVerkaufP1, 1, results);
		final int[][] P2Prod = matrixAnlegen(geplanterLagerbestand, geplantVerkaufP2, 2, results);
		final int[][] P3Prod = matrixAnlegen(geplanterLagerbestand, geplantVerkaufP3, 3, results);

		printMatrizen(P1Prod, P2Prod, P3Prod);

	}

	private static void printMatrizen(int[][] p1Prod, int[][] p2Prod, int[][] p3Prod) {
		// Artikel | geplanterVerkauf | geplanter Lagerbestand | Lagerbestand
		// Vorperiode | Aufträge Wartschlange | Aufträge Bearbeitung
		System.out.println("Für P1 besteht folgende Matrix:");
		System.out.println(
				"Artikel | geplanterVerkauf | geplanter Lagerbestand | Lagerbestand | Vorperiode | Aufträge Wartschlange | Aufträge Bearbeitung");
		for (int i = 0; i < p1Prod.length; i++) {
			for (int j = 0; j < p1Prod[i].length; j++) {
				if (j == 6) {
					System.out.print(p1Prod[i][j] + " ");
				} else {
					System.out.print(p1Prod[i][j] + " | ");
				}
			}
			System.out.println();
		}
		System.out.println("Für P2 besteht folgende Matrix:");
		System.out.println(
				"Artikel | geplanterVerkauf | geplanter Lagerbestand | Lagerbestand | Vorperiode | Aufträge Wartschlange | Aufträge Bearbeitung");
		for (int i = 0; i < p2Prod.length; i++) {
			for (int j = 0; j < p2Prod[i].length; j++) {
				if (j == 6) {
					System.out.print(p2Prod[i][j] + " ");
				} else {
					System.out.print(p2Prod[i][j] + " | ");
				}
			}
			System.out.println();
		}
		System.out.println("Für P3 besteht folgende Matrix:");
		System.out.println(
				"Artikelnummer | verbindl. Aufträge | geplanter Lagerbestand | Lagerbestand d. Vorperiode | Aufträge Wartschlange | Aufträge Bearbeitung | Produktionsaufträge");
		for (int i = 0; i < p3Prod.length; i++) {
			for (int j = 0; j < p3Prod[i].length; j++) {
				if (j == 6) {
					System.out.print(p3Prod[i][j] + " ");
				} else {
					System.out.print(p3Prod[i][j] + " | ");
				}
			}
			System.out.println();
		}

	}

	private static int[][] matrixAnlegen(int geplanterLagerbestand, int geplantVerkauf,
			int produktionFall, Results results) {
		// Artikel ermitteln
		List<Article> articles = results.getWarehousestock()
				.getArticle();
		// In Warteschlange befüllen
		Map<Integer, Integer> artikelInWarteschlange = warteschlangeErmitteln(results);
		// In Bearbeitungsaufträge befüllen
		Map<Integer, Integer> artikelInBearbeitung = bearbeitungErmitteln(results);

		int[][] matrix = null;
		if (produktionFall == 1) {
			int[][] matrix1 = {
					{ 1, geplantVerkauf, geplanterLagerbestand, findAmountById(articles, 1), 0, 0,
							0 },
					{ 26, 0, geplanterLagerbestand, findAmountById(articles, 26), 0, 0, 0 },
					{ 51, 0, geplanterLagerbestand, findAmountById(articles, 51), 0, 0, 0 },
					{ 16, 0, geplanterLagerbestand, findAmountById(articles, 16), 0, 0, 0 },
					{ 17, 0, geplanterLagerbestand, findAmountById(articles, 17), 0, 0, 0 },
					{ 50, 0, geplanterLagerbestand, findAmountById(articles, 50), 0, 0, 0 },
					{ 4, 0, geplanterLagerbestand, findAmountById(articles, 4), 0, 0, 0 },
					{ 10, 0, geplanterLagerbestand, findAmountById(articles, 10), 0, 0, 0 },
					{ 49, 0, geplanterLagerbestand, findAmountById(articles, 49), 0, 0, 0 },
					{ 7, 0, geplanterLagerbestand, findAmountById(articles, 7), 0, 0, 0 },
					{ 13, 0, geplanterLagerbestand, findAmountById(articles, 13), 0, 0, 0 },
					{ 18, 0, geplanterLagerbestand, findAmountById(articles, 18), 0, 0, 0 } };
			matrix = matrix1;
		} else if (produktionFall == 2) {
			int[][] matrix2 = {
					{ 2, geplantVerkauf, geplanterLagerbestand, findAmountById(articles, 2), 0, 0,
							0 },
					{ 26, 0, geplanterLagerbestand, findAmountById(articles, 26), 0, 0, 0 },
					{ 56, 0, geplanterLagerbestand, findAmountById(articles, 56), 0, 0, 0 },
					{ 16, 0, geplanterLagerbestand, findAmountById(articles, 16), 0, 0, 0 },
					{ 17, 0, geplanterLagerbestand, findAmountById(articles, 17), 0, 0, 0 },
					{ 55, 0, geplanterLagerbestand, findAmountById(articles, 55), 0, 0, 0 },
					{ 5, 0, geplanterLagerbestand, findAmountById(articles, 5), 0, 0, 0 },
					{ 11, 0, geplanterLagerbestand, findAmountById(articles, 11), 0, 0, 0 },
					{ 54, 0, geplanterLagerbestand, findAmountById(articles, 54), 0, 0, 0 },
					{ 8, 0, geplanterLagerbestand, findAmountById(articles, 8), 0, 0, 0 },
					{ 14, 0, geplanterLagerbestand, findAmountById(articles, 14), 0, 0, 0 },
					{ 19, 0, geplanterLagerbestand, findAmountById(articles, 19), 0, 0, 0 } };
			matrix = matrix2;
		} else if (produktionFall == 3) {
			int[][] matrix3 = {
					{ 3, geplantVerkauf, geplanterLagerbestand, findAmountById(articles, 3), 0, 0,
							0 },
					{ 26, 0, geplanterLagerbestand, findAmountById(articles, 26), 0, 0, 0 },
					{ 31, 0, geplanterLagerbestand, findAmountById(articles, 31), 0, 0, 0 },
					{ 16, 0, geplanterLagerbestand, findAmountById(articles, 16), 0, 0, 0 },
					{ 17, 0, geplanterLagerbestand, findAmountById(articles, 17), 0, 0, 0 },
					{ 30, 0, geplanterLagerbestand, findAmountById(articles, 30), 0, 0, 0 },
					{ 6, 0, geplanterLagerbestand, findAmountById(articles, 6), 0, 0, 0 },
					{ 12, 0, geplanterLagerbestand, findAmountById(articles, 12), 0, 0, 0 },
					{ 29, 0, geplanterLagerbestand, findAmountById(articles, 29), 0, 0, 0 },
					{ 9, 0, geplanterLagerbestand, findAmountById(articles, 9), 0, 0, 0 },
					{ 15, 0, geplanterLagerbestand, findAmountById(articles, 15), 0, 0, 0 },
					{ 20, 0, geplanterLagerbestand, findAmountById(articles, 20), 0, 0, 0 } };
			matrix = matrix3;
		}

		if (matrix == null) {
			return null;
		}

		for (Integer artikelNummer : artikelInWarteschlange.keySet()) {
			ersetzeWarteschlangenItems(matrix, artikelNummer,
					artikelInWarteschlange.get(artikelNummer));
		}

		for (Integer artikelNummer : artikelInBearbeitung.keySet()) {
			ersetzeInBearbeitungItems(matrix, artikelNummer,
					artikelInBearbeitung.get(artikelNummer));
		}

		// Produktion P1 berechnen

		matrix[0][6] = matrix[0][1] + matrix[0][2] - matrix[0][3] - matrix[0][4] - matrix[0][5];

		// Produktion in geplanter Verkauf übertragen
		matrix[1][1] = matrix[0][6];
		matrix[2][1] = matrix[0][6];

		matrix[1][6] = matrix[1][1] + matrix[1][2] - matrix[1][3] - matrix[1][4] - matrix[1][5];
		matrix[2][6] = matrix[2][1] + matrix[2][2] - matrix[2][3] - matrix[2][4] - matrix[2][5];

		// Produktion in geplanter Verkauf übertragen
		matrix[3][1] = matrix[2][6];
		matrix[4][1] = matrix[2][6];
		matrix[5][1] = matrix[2][6];

		matrix[3][6] = matrix[3][1] + matrix[3][2] - matrix[3][3] - matrix[3][4] - matrix[3][5];
		matrix[4][6] = matrix[4][1] + matrix[4][2] - matrix[4][3] - matrix[4][4] - matrix[4][5];
		matrix[5][6] = matrix[5][1] + matrix[5][2] - matrix[5][3] - matrix[5][4] - matrix[5][5];

		// Produktion in geplanter Verkauf übertragen
		matrix[6][1] = matrix[5][6];
		matrix[7][1] = matrix[5][6];
		matrix[8][1] = matrix[5][6];

		matrix[6][6] = matrix[6][1] + matrix[6][2] - matrix[6][3] - matrix[6][4] - matrix[6][5];
		matrix[7][6] = matrix[7][1] + matrix[7][2] - matrix[7][3] - matrix[7][4] - matrix[7][5];
		matrix[8][6] = matrix[8][1] + matrix[8][2] - matrix[8][3] - matrix[8][4] - matrix[8][5];

		// Produktion in geplanter Verkauf übertragen
		matrix[9][1] = matrix[8][6];
		matrix[10][1] = matrix[8][6];
		matrix[11][1] = matrix[8][6];

		matrix[9][6] = matrix[9][1] + matrix[9][2] - matrix[9][3] - matrix[9][4] - matrix[9][5];
		matrix[10][6] = matrix[10][1] + matrix[10][2] - matrix[10][3] - matrix[10][4]
				- matrix[10][5];
		matrix[11][6] = matrix[11][1] + matrix[11][2] - matrix[11][3] - matrix[11][4]
				- matrix[11][5];
		return matrix;
	}

	private static Map<Integer, Integer> bearbeitungErmitteln(Results results) {
		Map<Integer, Integer> inBearbeitung = new HashMap<>();
		Ordersinwork ordersinwork = results.getOrdersinwork();
		List<generated.Results.Ordersinwork.Workplace> workplaces = ordersinwork.getWorkplace();
		for (generated.Results.Ordersinwork.Workplace workplace : workplaces) {
			Integer itemNummer = Integer.parseInt("" + workplace.getItem());
			Integer anzahl = Integer.parseInt("" + workplace.getAmount());
			if (inBearbeitung.containsKey(itemNummer)) {
				Integer anzahlVorhanden = inBearbeitung.get(itemNummer) + anzahl;
				inBearbeitung.put(itemNummer, anzahlVorhanden);
			} else {
				inBearbeitung.put(itemNummer, anzahl);
			}
		}
		return inBearbeitung;
	}

	private static void ersetzeWarteschlangenItems(int[][] matrix, Integer artikelNummer,
			Integer artikelMenge) {
		int zeilenNummer = artikelVorhanden(matrix, artikelNummer);
		// 12 bedeutet nicht vorhanden, da matrix nur bis 12 geht
		if (zeilenNummer != 12) {
			matrix[zeilenNummer][4] = artikelMenge;
		}
	}

	private static void ersetzeInBearbeitungItems(int[][] matrix, Integer artikelNummer,
			Integer artikelMenge) {
		int zeilenNummer = artikelVorhanden(matrix, artikelNummer);
		// 12 bedeutet nicht vorhanden, da matrix nur bis 12 geht
		if (zeilenNummer != 12) {
			matrix[zeilenNummer][5] = artikelMenge;
		}
	}

	private static int artikelVorhanden(int[][] matrix, Integer artikelNummer) {
		for (int i = 0; i < 12; i++) {
			if (matrix[i][0] == artikelNummer)
				return i;
		}
		// 12 bedeutet nicht vorhanden, da matrix nur bis 12 geht
		return 12;
	}

	private static Map<Integer, Integer> warteschlangeErmitteln(Results results) {
		Map<Integer, Integer> warteschlange = new HashMap<>();

		List<Workplace> workplaces = results.getWaitinglistworkstations()
				.getWorkplace();
		for (Workplace workplace : workplaces) {
			Byte id = workplace.getId();
			if (workplace.getContent() != null) {
				List<Serializable> content = workplace.getContent();
				for (Serializable serializable : content) {
					JAXBElement<Waitinglist> test = (JAXBElement<Waitinglist>) serializable;

					Waitinglist waitinglist = test.getValue();
					Integer itemNummer = Integer.parseInt("" + waitinglist.getItem());
					Integer anzahl = Integer.parseInt("" + waitinglist.getAmount());
					if (anzahl < 0)
						anzahl = anzahl + 256;

					if (warteschlange.containsKey(itemNummer)) {
						Integer anzahlVorhanden = warteschlange.get(itemNummer) + anzahl;
						warteschlange.put(itemNummer, anzahlVorhanden);
					} else {
						warteschlange.put(itemNummer, anzahl);
					}
				}
			}
		}
		return warteschlange;

	}

	private static int findAmountById(List<Article> articles, int i) {
		for (Article article : articles) {
			if (article.getId()
					.intValue() == i) {
				return article.getAmount()
						.intValue();
			}
		}
		return 0;
	}
}
