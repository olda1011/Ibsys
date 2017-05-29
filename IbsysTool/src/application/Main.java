package application;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import generated.Results;
import generated.Results.Ordersinwork;
import generated.Results.Waitinglistworkstations.Workplace;
import generated.Results.Waitinglistworkstations.Workplace.Waitinglist;
import generated.Results.Warehousestock.Article;

public class Main {

	public static int[][] prognosen;
	public static int[][] p1Prod;
	public static int[][] p2Prod;
	public static int[][] p3Prod;
	public static int[][] p1KaufteileVerwendung;
	public static int[][] p2KaufteileVerwendung;
	public static int[][] p3KaufteileVerwendung;

	public static int[][] kaufteileVerwendungMerged;
	public static Results results;
	public static int geplanterLagerbestand;

	private Main() {

	}

	public static void main() {

		geplanterLagerbestand = 50;

		prognosen = new int[][] { { 1, 150, 50, 200, 200 }, { 2, 250, 150, 200, 200 },
				{ 3, 100, 50, 200, 200 } };

		System.out.println("Folgende Mengen sollen verkauft werden in der nächsten Periode:\n");
		System.out.println("P1: " + prognosen[0][1]);
		System.out.println("P2: " + prognosen[1][1]);
		System.out.println("P3: " + prognosen[2][1]);
		System.out.println();
		System.out.println("Der geplante Lagerbestand beträgt: " + geplanterLagerbestand);
		System.out.println();

		// Matrix für Disposition anlegen

		p1Prod = matrixAnlegen(geplanterLagerbestand, prognosen[0][1], 1, results);
		p2Prod = matrixAnlegen(geplanterLagerbestand, prognosen[1][1], 2, results);
		p3Prod = matrixAnlegen(geplanterLagerbestand, prognosen[2][1], 3, results);

		// printMatrizen(P1Prod, P2Prod, P3Prod);

		printMatrizen(p1Prod, p2Prod, p3Prod);

		// Kaufteilbedarf errechnen

		p1KaufteileVerwendung = generiereKaufteileVerwendung(1, p1Prod);
		p2KaufteileVerwendung = generiereKaufteileVerwendung(2, p2Prod);
		p3KaufteileVerwendung = generiereKaufteileVerwendung(3, p3Prod);

		kaufteileVerwendungMerged = mergeKautfteileVerwendung(p1KaufteileVerwendung,
				p2KaufteileVerwendung, p3KaufteileVerwendung);

		System.out.println("Folgende Kaufteile für P1 werden benötigt:");
		printKaufteilmatrix(p1KaufteileVerwendung);
		System.out.println("Folgende Kaufteile für P2 werden benötigt:");
		printKaufteilmatrix(p2KaufteileVerwendung);
		System.out.println("Folgende Kaufteile für P3 werden benötigt:");
		printKaufteilmatrix(p3KaufteileVerwendung);
	}

	public static boolean loadXmlData(String path) {
		File file = new File(path);
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Results.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			results = (Results) jaxbUnmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (results == null) {
			return true;
		}
		return false;
	}

	public static int[][] mergeKautfteileVerwendung(int[][] p1KaufteileVerwendung2,
			int[][] p2KaufteileVerwendung2, int[][] p3KaufteileVerwendung2) {
		int[][] merged = { { 21, 0, 0, 0, 0, 0 }, { 22, 0, 0, 0, 0, 0 }, { 23, 0, 0, 0, 0, 0 },
				{ 24, 0, 0, 0, 0, 0 }, { 25, 0, 0, 0, 0, 0 }, { 27, 0, 0, 0, 0, 0 },
				{ 28, 0, 0, 0, 0, 0 }, { 32, 0, 0, 0, 0, 0 }, { 33, 0, 0, 0, 0, 0 },
				{ 34, 0, 0, 0, 0, 0 }, { 35, 0, 0, 0, 0, 0 }, { 36, 0, 0, 0, 0, 0 },
				{ 37, 0, 0, 0, 0, 0 }, { 38, 0, 0, 0, 0, 0 }, { 39, 0, 0, 0, 0, 0 },
				{ 40, 0, 0, 0, 0, 0 }, { 41, 0, 0, 0, 0, 0 }, { 42, 0, 0, 0, 0, 0 },
				{ 43, 0, 0, 0, 0, 0 }, { 44, 0, 0, 0, 0, 0 }, { 45, 0, 0, 0, 0, 0 },
				{ 46, 0, 0, 0, 0, 0 }, { 47, 0, 0, 0, 0, 0 }, { 48, 0, 0, 0, 0, 0 },
				{ 52, 0, 0, 0, 0, 0 }, { 53, 0, 0, 0, 0, 0 }, { 57, 0, 0, 0, 0, 0 },
				{ 58, 0, 0, 0, 0, 0 }, { 59, 0, 0, 0, 0, 0 } };

		for (int i = 0; i < p1KaufteileVerwendung2.length; i++) {
			for (int j = 0; j < p1KaufteileVerwendung2[i].length; j++) {
				if (j == 0) {

				} else if (j == 1) {
					merged[i][j] = p1KaufteileVerwendung2[i][j];
				} else {
					merged[i][j] += p1KaufteileVerwendung2[i][j];
				}
			}

		}
		for (int i = 0; i < p2KaufteileVerwendung2.length; i++) {
			for (int j = 0; j < p2KaufteileVerwendung2[i].length; j++) {
				if (j == 0) {

				} else if (j == 1) {
					merged[i][j] = p2KaufteileVerwendung2[i][j];
				} else {
					merged[i][j] += p2KaufteileVerwendung2[i][j];
				}
			}

		}
		for (int i = 0; i < p3KaufteileVerwendung2.length; i++) {
			for (int j = 0; j < p3KaufteileVerwendung2[i].length; j++) {
				if (j == 0) {

				} else if (j == 1) {
					merged[i][j] = p3KaufteileVerwendung2[i][j];
				} else {
					merged[i][j] += p3KaufteileVerwendung2[i][j];
				}
			}

		}

		// TODO Auto-generated method stub
		return merged;
	}

	public static int[][] generiereKaufteileVerwendung(int produkt, int[][] Prod) {
		int[][] matrix = null;
		List<Article> articles = results.getWarehousestock()
				.getArticle();
		if (produkt == 1) {
			int[][] p1 = {
					{ 21, findAmountById(articles, 21), 1 * Prod[0][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 22, findAmountById(articles, 22), 0 * Prod[0][7], 0 * prognosen[0][2],
							0 * prognosen[0][3], 0 * prognosen[0][4] },
					{ 23, findAmountById(articles, 23), 0 * Prod[0][7], 0 * prognosen[0][2],
							0 * prognosen[0][3], 0 * prognosen[0][4] },
					{ 24, findAmountById(articles, 24),
							1 * Prod[0][7] + 1 * Prod[2][7] + 1 * Prod[3][7] + 2 * Prod[5][7]
									+ 2 * Prod[8][7],
							7 * prognosen[0][2], 7 * prognosen[0][3], 7 * prognosen[0][4] },
					{ 25, findAmountById(articles, 25),
							1 * Prod[0][7] + 2 * Prod[5][7] + 2 * Prod[8][7], 4 * prognosen[0][2],
							4 * prognosen[0][3], 4 * prognosen[0][4] },
					{ 27, findAmountById(articles, 27), 1 * Prod[0][7] + 1 * Prod[2][7],
							2 * prognosen[0][2], 2 * prognosen[0][3], 2 * prognosen[0][4] },
					{ 28, findAmountById(articles, 28), 1 * Prod[3][7] + 3 * Prod[11][7],
							4 * prognosen[0][2], 4 * prognosen[0][3], 4 * prognosen[0][4] },
					{ 32, findAmountById(articles, 32),
							1 * Prod[7][7] + 1 * Prod[10][7] + 1 * Prod[11][7], 3 * prognosen[0][2],
							3 * prognosen[0][3], 3 * prognosen[0][4] },
					{ 33, findAmountById(articles, 33), 0, 0, 0, 0 },
					{ 34, findAmountById(articles, 34), 0, 0, 0, 0 },
					{ 35, findAmountById(articles, 35), 2 * Prod[6][7] + 2 * Prod[9][7],
							4 * prognosen[0][2], 4 * prognosen[0][3], 4 * prognosen[0][4] },
					{ 36, findAmountById(articles, 36), 1 * Prod[6][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 37, findAmountById(articles, 37), 1 * Prod[6][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 38, findAmountById(articles, 38), 1 * Prod[6][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 39, findAmountById(articles, 39), 1 * Prod[7][7] + 1 * Prod[9][7],
							2 * prognosen[0][2], 2 * prognosen[0][3], 2 * prognosen[0][4] },
					{ 40, findAmountById(articles, 40), 1 * Prod[3][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 41, findAmountById(articles, 41), 1 * Prod[3][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 42, findAmountById(articles, 42), 2 * Prod[3][7], 2 * prognosen[0][2],
							2 * prognosen[0][3], 2 * prognosen[0][4] },
					{ 43, findAmountById(articles, 43), 1 * Prod[3][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 44, findAmountById(articles, 44), 2 * Prod[1][7] + 1 * Prod[3][7],
							3 * prognosen[0][2], 3 * prognosen[0][3], 3 * prognosen[0][4] },
					{ 45, findAmountById(articles, 45), 1 * Prod[4][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 46, findAmountById(articles, 46), 1 * Prod[4][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 47, findAmountById(articles, 47), 1 * Prod[4][7], 1 * prognosen[0][2],
							1 * prognosen[0][3], 1 * prognosen[0][4] },
					{ 48, findAmountById(articles, 48), 2 * Prod[4][7], 2 * prognosen[0][2],
							2 * prognosen[0][3], 2 * prognosen[0][4] },
					{ 52, findAmountById(articles, 52), 1 * Prod[4][7] + 1 * Prod[9][7],
							2 * prognosen[0][2], 2 * prognosen[0][3], 2 * prognosen[0][4] },
					{ 53, findAmountById(articles, 53), 36 * Prod[6][7] + 36 * Prod[9][7],
							72 * prognosen[0][2], 72 * prognosen[0][3], 72 * prognosen[0][4] },
					{ 57, findAmountById(articles, 57), 0, 0, 0, 0 },
					{ 58, findAmountById(articles, 58), 0, 0, 0, 0 },
					{ 59, findAmountById(articles, 59), 2 * Prod[11][7], 11 * prognosen[0][2],
							11 * prognosen[0][3], 11 * prognosen[0][4] } };
			matrix = p1;
		} else if (produkt == 2) {
			final int[][] p2 = { { 21, findAmountById(articles, 21), 0, 0, 0, 0 },
					{ 22, findAmountById(articles, 22), 1 * Prod[0][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 23, findAmountById(articles, 23), 0 * Prod[0][7], 0 * prognosen[1][2],
							0 * prognosen[1][3], 0 * prognosen[1][4] },
					{ 24, findAmountById(articles, 24),
							1 * Prod[0][7] + 1 * Prod[2][7] + 1 * Prod[3][7] + 2 * Prod[5][7]
									+ 2 * Prod[8][7],
							7 * prognosen[1][2], 7 * prognosen[1][3], 7 * prognosen[1][4] },
					{ 25, findAmountById(articles, 25),
							1 * Prod[0][7] + 2 * Prod[5][7] + 2 * Prod[8][7], 4 * prognosen[1][2],
							4 * prognosen[1][3], 4 * prognosen[1][4] },
					{ 27, findAmountById(articles, 27), 1 * Prod[0][7] + 1 * Prod[2][7],
							2 * prognosen[1][2], 2 * prognosen[1][3], 2 * prognosen[1][4] },
					{ 28, findAmountById(articles, 28), 1 * Prod[3][7] + 4 * Prod[11][7],
							5 * prognosen[1][2], 5 * prognosen[1][3], 5 * prognosen[1][4] },
					{ 32, findAmountById(articles, 32),
							1 * Prod[7][7] + 1 * Prod[10][7] + 1 * Prod[11][7], 3 * prognosen[1][2],
							3 * prognosen[1][3], 3 * prognosen[1][4] },
					{ 33, findAmountById(articles, 33), 0, 0, 0, 0 },
					{ 34, findAmountById(articles, 34), 0, 0, 0, 0 },
					{ 35, findAmountById(articles, 35), 2 * Prod[6][7] + 2 * Prod[9][7],
							4 * prognosen[1][2], 4 * prognosen[1][3], 4 * prognosen[1][4] },
					{ 36, findAmountById(articles, 36), 1 * Prod[6][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 37, findAmountById(articles, 37), 1 * Prod[9][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 38, findAmountById(articles, 38), 1 * Prod[9][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 39, findAmountById(articles, 39), 1 * Prod[7][7] + 1 * Prod[9][7],
							2 * prognosen[1][2], 2 * prognosen[1][3], 2 * prognosen[1][4] },
					{ 40, findAmountById(articles, 40), 1 * Prod[3][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 41, findAmountById(articles, 41), 1 * Prod[3][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 42, findAmountById(articles, 42), 2 * Prod[3][7], 2 * prognosen[1][2],
							2 * prognosen[1][3], 2 * prognosen[1][4] },
					{ 43, findAmountById(articles, 43), 1 * Prod[4][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 44, findAmountById(articles, 44), 2 * Prod[1][7] + 1 * Prod[4][7],
							3 * prognosen[1][2], 3 * prognosen[1][3], 3 * prognosen[1][4] },
					{ 45, findAmountById(articles, 45), 1 * Prod[4][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 46, findAmountById(articles, 46), 1 * Prod[4][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 47, findAmountById(articles, 47), 1 * Prod[1][7], 1 * prognosen[1][2],
							1 * prognosen[1][3], 1 * prognosen[1][4] },
					{ 48, findAmountById(articles, 48), 2 * Prod[1][7], 2 * prognosen[1][2],
							2 * prognosen[1][3], 2 * prognosen[1][4] },
					{ 52, findAmountById(articles, 52), 0, 0, 0, 0 },
					{ 53, findAmountById(articles, 53), 0, 0, 0, 0 },
					{ 57, findAmountById(articles, 57), 1 * Prod[6][7] + 1 * Prod[9][7],
							2 * prognosen[1][2], 2 * prognosen[1][3], 2 * prognosen[1][4] },
					{ 58, findAmountById(articles, 58), 36 * Prod[6][7] + 36 * Prod[9][7],
							72 * prognosen[1][2], 72 * prognosen[1][3], 72 * prognosen[1][4] },
					{ 59, findAmountById(articles, 59), 2 * Prod[11][7], 11 * prognosen[1][2],
							11 * prognosen[1][3], 11 * prognosen[1][4] } };
			matrix = p2;
		} else if (produkt == 3) {
			final int[][] p3 = { { 21, findAmountById(articles, 21), 0, 0, 0, 0 },
					{ 22, findAmountById(articles, 22), 0, 0, 0, 0 },
					{ 23, findAmountById(articles, 23), 1 * Prod[0][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 24, findAmountById(articles, 24),
							1 * Prod[0][7] + 1 * Prod[2][7] + 1 * Prod[3][7] + 2 * Prod[5][7]
									+ 2 * Prod[8][7],
							7 * prognosen[2][2], 7 * prognosen[2][3], 7 * prognosen[2][4] },
					{ 25, findAmountById(articles, 25),
							1 * Prod[0][7] + 2 * Prod[5][7] + 2 * Prod[8][7], 4 * prognosen[2][2],
							4 * prognosen[2][3], 4 * prognosen[2][4] },
					{ 27, findAmountById(articles, 27), 1 * Prod[0][7] + 1 * Prod[2][7],
							2 * prognosen[2][2], 2 * prognosen[2][3], 2 * prognosen[2][4] },
					{ 28, findAmountById(articles, 28), 1 * Prod[3][7] + 5 * Prod[11][7],
							6 * prognosen[2][2], 6 * prognosen[2][3], 6 * prognosen[2][4] },
					{ 32, findAmountById(articles, 32),
							1 * Prod[7][7] + 1 * Prod[10][7] + 1 * Prod[11][7], 3 * prognosen[2][2],
							3 * prognosen[2][3], 3 * prognosen[2][4] },
					{ 33, findAmountById(articles, 33), 1 * Prod[6][7] + 1 * Prod[9][7],
							2 * prognosen[2][2], 2 * prognosen[2][3], 2 * prognosen[2][4] },
					{ 34, findAmountById(articles, 34), 36 * Prod[6][7] + 36 * Prod[9][7],
							72 * prognosen[2][2], 72 * prognosen[2][3], 72 * prognosen[2][4] },
					{ 35, findAmountById(articles, 35), 2 * Prod[6][7] + 2 * Prod[9][7],
							4 * prognosen[2][2], 4 * prognosen[2][3], 4 * prognosen[2][4] },
					{ 36, findAmountById(articles, 36), 1 * Prod[6][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 37, findAmountById(articles, 37), 1 * Prod[9][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 38, findAmountById(articles, 38), 1 * Prod[9][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 39, findAmountById(articles, 39), 1 * Prod[7][7] + 1 * Prod[9][7],
							2 * prognosen[2][2], 2 * prognosen[2][3], 2 * prognosen[2][4] },
					{ 40, findAmountById(articles, 40), 1 * Prod[3][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 41, findAmountById(articles, 41), 1 * Prod[3][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 42, findAmountById(articles, 42), 2 * Prod[3][7], 2 * prognosen[2][2],
							2 * prognosen[2][3], 2 * prognosen[2][4] },
					{ 43, findAmountById(articles, 43), 1 * Prod[4][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 44, findAmountById(articles, 44), 2 * Prod[1][7] + 1 * Prod[4][7],
							3 * prognosen[2][2], 3 * prognosen[2][3], 3 * prognosen[2][4] },
					{ 45, findAmountById(articles, 45), 1 * Prod[4][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 46, findAmountById(articles, 46), 1 * Prod[4][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 47, findAmountById(articles, 47), 1 * Prod[1][7], 1 * prognosen[2][2],
							1 * prognosen[2][3], 1 * prognosen[2][4] },
					{ 48, findAmountById(articles, 48), 2 * Prod[1][7], 2 * prognosen[2][2],
							2 * prognosen[2][3], 2 * prognosen[2][4] },
					{ 52, findAmountById(articles, 52), 0, 0, 0, 0 },
					{ 53, findAmountById(articles, 53), 0, 0, 0, 0 },
					{ 57, findAmountById(articles, 57), 0, 0, 0, 0 },
					{ 58, findAmountById(articles, 58), 0, 0, 0, 0 },
					{ 59, findAmountById(articles, 59), 2 * Prod[11][7], 11 * prognosen[2][2],
							11 * prognosen[2][3], 11 * prognosen[2][4] } };
			matrix = p3;
		}

		return matrix;
	}

	private static void printMatrizen(int[][] p1Prod, int[][] p2Prod, int[][] p3Prod) {

		String matrizenBezeichnungen = "Artikel | geplanterVerkauf | Übertrag Warteschlange | geplanter Lagerbestand | Lagerbestand Vorperiode | Aufträge Wartschlange | Aufträge Bearbeitung | Produktionsaufträge";
		// Artikel | geplanterVerkauf | geplanter Lagerbestand | Lagerbestand
		// Vorperiode | Aufträge Wartschlange | Aufträge Bearbeitung
		System.out.println("Für P1 besteht folgende Matrix:");
		System.out.println(matrizenBezeichnungen);
		for (int i = 0; i < p1Prod.length; i++) {
			for (int j = 0; j < p1Prod[i].length; j++) {
				if (j == (p1Prod[i].length - 1)) {
					System.out.print(p1Prod[i][j] + " ");
				} else {
					System.out.print(p1Prod[i][j] + " | ");
				}
			}
			System.out.println();
		}
		System.out.println("Für P2 besteht folgende Matrix:");
		System.out.println(matrizenBezeichnungen);
		for (int i = 0; i < p2Prod.length; i++) {
			for (int j = 0; j < p2Prod[i].length; j++) {
				if (j == (p2Prod[i].length - 1)) {
					System.out.print(p2Prod[i][j] + " ");
				} else {
					System.out.print(p2Prod[i][j] + " | ");
				}
			}
			System.out.println();
		}
		System.out.println("Für P3 besteht folgende Matrix:");
		System.out.println(matrizenBezeichnungen);
		for (int i = 0; i < p3Prod.length; i++) {
			for (int j = 0; j < p3Prod[i].length; j++) {
				if (j == (p3Prod[i].length - 1)) {
					System.out.print(p3Prod[i][j] + " ");
				} else {
					System.out.print(p3Prod[i][j] + " | ");
				}
			}
			System.out.println();
		}

	}

	private static void printKaufteilmatrix(int[][] matrix) {

		System.out.println();
		String bezeichnungKaufteileBedarf = "Kaufteil | Lager | Bedarf N | Bedarf 1 | Bedarf 2 | Bedarf 3";
		System.out.println(bezeichnungKaufteileBedarf);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == (matrix[i].length - 1)) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print(matrix[i][j] + " | ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int[][] matrixAnlegen(int geplanterLagerbestand, int geplantVerkauf,
			int produktionFall, Results results) {
		// Artikel ermitteln
		List<Article> articles = results.getWarehousestock()
				.getArticle();
		// In Warteschlange befüllen
		Map<Integer, Integer> artikelInWarteschlange = warteschlangeErmitteln(results);
		// In Bearbeitungsaufträge befüllen
		Map<Integer, Integer> artikelInBearbeitung = bearbeitungErmitteln(results);

		int menge26 = findAmountById(articles, 26);
		int mod26 = menge26 % 3;
		menge26 = menge26 / 3;
		int menge16 = findAmountById(articles, 16);
		int mod16 = menge16 % 3;
		menge16 = menge16 / 3;
		int menge17 = findAmountById(articles, 17);
		int mod17 = menge17 % 3;
		menge17 = menge17 / 3;

		int[][] matrix = null;

		if (produktionFall == 1) {
			int[][] matrix1 = {
					{ 1, geplantVerkauf, 0, geplanterLagerbestand, findAmountById(articles, 1), 0,
							0, 0 },
					{ 26, 0, 0, geplanterLagerbestand, menge26 + mod26, 0, 0, 0 },
					{ 51, 0, 0, geplanterLagerbestand, findAmountById(articles, 51), 0, 0, 0 },
					{ 16, 0, 0, geplanterLagerbestand, menge16 + mod16, 0, 0, 0 },
					{ 17, 0, 0, geplanterLagerbestand, menge17 + mod17, 0, 0, 0 },
					{ 50, 0, 0, geplanterLagerbestand, findAmountById(articles, 50), 0, 0, 0 },
					{ 4, 0, 0, geplanterLagerbestand, findAmountById(articles, 4), 0, 0, 0 },
					{ 10, 0, 0, geplanterLagerbestand, findAmountById(articles, 10), 0, 0, 0 },
					{ 49, 0, 0, geplanterLagerbestand, findAmountById(articles, 49), 0, 0, 0 },
					{ 7, 0, 0, geplanterLagerbestand, findAmountById(articles, 7), 0, 0, 0 },
					{ 13, 0, 0, geplanterLagerbestand, findAmountById(articles, 13), 0, 0, 0 },
					{ 18, 0, 0, geplanterLagerbestand, findAmountById(articles, 18), 0, 0, 0 } };
			matrix = matrix1;
		} else if (produktionFall == 2) {
			int[][] matrix2 = {
					{ 2, geplantVerkauf, 0, geplanterLagerbestand, findAmountById(articles, 2), 0,
							0, 0 },
					{ 26, 0, 0, geplanterLagerbestand, mod26, 0, 0, 0 },
					{ 56, 0, 0, geplanterLagerbestand, findAmountById(articles, 56), 0, 0, 0 },
					{ 16, 0, 0, geplanterLagerbestand, mod16, 0, 0, 0 },
					{ 17, 0, 0, geplanterLagerbestand, mod17, 0, 0, 0 },
					{ 55, 0, 0, geplanterLagerbestand, findAmountById(articles, 55), 0, 0, 0 },
					{ 5, 0, 0, geplanterLagerbestand, findAmountById(articles, 5), 0, 0, 0 },
					{ 11, 0, 0, geplanterLagerbestand, findAmountById(articles, 11), 0, 0, 0 },
					{ 54, 0, 0, geplanterLagerbestand, findAmountById(articles, 54), 0, 0, 0 },
					{ 8, 0, 0, geplanterLagerbestand, findAmountById(articles, 8), 0, 0, 0 },
					{ 14, 0, 0, geplanterLagerbestand, findAmountById(articles, 14), 0, 0, 0 },
					{ 19, 0, 0, geplanterLagerbestand, findAmountById(articles, 19), 0, 0, 0 } };
			matrix = matrix2;
		} else if (produktionFall == 3) {
			int[][] matrix3 = {
					{ 3, geplantVerkauf, 0, geplanterLagerbestand, findAmountById(articles, 3), 0,
							0, 0 },
					{ 26, 0, 0, geplanterLagerbestand, mod26, 0, 0, 0 },
					{ 31, 0, 0, geplanterLagerbestand, findAmountById(articles, 31), 0, 0, 0 },
					{ 16, 0, 0, geplanterLagerbestand, mod16, 0, 0, 0 },
					{ 17, 0, 0, geplanterLagerbestand, mod17, 0, 0, 0 },
					{ 30, 0, 0, geplanterLagerbestand, findAmountById(articles, 30), 0, 0, 0 },
					{ 6, 0, 0, geplanterLagerbestand, findAmountById(articles, 6), 0, 0, 0 },
					{ 12, 0, 0, geplanterLagerbestand, findAmountById(articles, 12), 0, 0, 0 },
					{ 29, 0, 0, geplanterLagerbestand, findAmountById(articles, 29), 0, 0, 0 },
					{ 9, 0, 0, geplanterLagerbestand, findAmountById(articles, 9), 0, 0, 0 },
					{ 15, 0, 0, geplanterLagerbestand, findAmountById(articles, 15), 0, 0, 0 },
					{ 20, 0, 0, geplanterLagerbestand, findAmountById(articles, 20), 0, 0, 0 } };
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

		matrix[0][7] = matrix[0][1] + matrix[0][2] + matrix[0][3] - matrix[0][4] - matrix[0][5]
				- matrix[0][6];

		// Produktion in geplanter Verkauf übertragen
		matrix[1][1] = matrix[0][7];
		matrix[1][2] = matrix[0][5];

		matrix[2][1] = matrix[0][7];
		matrix[2][2] = matrix[0][5];

		int modWarte26 = matrix[1][5] % 3;
		int modWiP26 = matrix[1][6] % 3;
		matrix[1][5] = matrix[1][5] / 3;
		matrix[1][6] = matrix[1][6] / 3;
		if (produktionFall == 1) {
			matrix[1][5] += modWarte26;
			matrix[1][6] += modWiP26;
		}

		matrix[1][7] = matrix[1][1] + matrix[1][2] + matrix[1][3] - matrix[1][4] - matrix[1][5]
				- matrix[1][6];
		matrix[2][7] = matrix[2][1] + matrix[2][2] + matrix[2][3] - matrix[2][4] - matrix[2][5]
				- matrix[2][6];

		// Produktion in geplanter Verkauf übertragen
		matrix[3][1] = matrix[2][7];
		matrix[3][2] = matrix[2][5];

		matrix[4][1] = matrix[2][7];
		matrix[4][2] = matrix[2][5];

		matrix[5][1] = matrix[2][7];
		matrix[5][2] = matrix[2][5];

		int modwarte16 = matrix[3][5] % 3;
		int modWip16 = matrix[3][6] % 3;

		int modwarte17 = matrix[4][5] % 3;
		int modWip17 = matrix[4][6] % 3;

		matrix[3][5] = matrix[3][5] / 3;
		matrix[3][6] = matrix[3][6] / 3;

		matrix[4][5] = matrix[4][5] / 3;
		matrix[4][6] = matrix[4][6] / 3;

		if (produktionFall == 1) {
			matrix[3][5] += modwarte16;
			matrix[3][6] += modWip16;

			matrix[4][5] += modwarte17;
			matrix[4][6] += modWip17;
		}

		matrix[3][7] = matrix[3][1] + matrix[3][2] + matrix[3][3] - matrix[3][4] - matrix[3][5]
				- matrix[3][6];
		matrix[4][7] = matrix[4][1] + matrix[4][2] + matrix[4][3] - matrix[4][4] - matrix[4][5]
				- matrix[4][6];
		matrix[5][7] = matrix[5][1] + matrix[5][2] + matrix[5][3] - matrix[5][4] - matrix[5][5]
				- matrix[5][6];

		// Produktion in geplanter Verkauf übertragen
		matrix[6][1] = matrix[5][7];
		matrix[6][2] = matrix[5][5];

		matrix[7][1] = matrix[5][7];
		matrix[7][2] = matrix[5][5];

		matrix[8][1] = matrix[5][7];
		matrix[8][2] = matrix[5][5];

		matrix[6][7] = matrix[6][1] + matrix[6][2] + matrix[6][3] - matrix[6][4] - matrix[6][5]
				- matrix[6][6];
		matrix[7][7] = matrix[7][1] + matrix[7][2] + matrix[7][3] - matrix[7][4] - matrix[7][5]
				- matrix[7][6];
		matrix[8][7] = matrix[8][1] + matrix[8][2] + matrix[8][3] - matrix[8][4] - matrix[8][5]
				- matrix[8][6];

		// Produktion in geplanter Verkauf übertragen
		matrix[9][1] = matrix[8][7];
		matrix[9][2] = matrix[8][5];

		matrix[10][1] = matrix[8][7];
		matrix[10][2] = matrix[8][5];

		matrix[11][1] = matrix[8][7];
		matrix[11][2] = matrix[8][5];

		matrix[9][7] = matrix[9][1] + matrix[9][2] + matrix[9][3] - matrix[9][4] - matrix[9][5]
				- matrix[9][6];
		matrix[10][7] = matrix[10][1] + matrix[10][2] + matrix[10][3] - matrix[10][4]
				- matrix[10][5] - matrix[10][6];
		matrix[11][7] = matrix[11][1] + matrix[11][2] + matrix[11][3] - matrix[11][4]
				- matrix[11][5] - matrix[11][6];

		return matrix;
	}

	public static int[][] calculateProduction(int[][] prodMatrix, int produktionsfall) {

		// Produktion berechnen

		prodMatrix[0][7] = prodMatrix[0][1] + prodMatrix[0][2] + prodMatrix[0][3] - prodMatrix[0][4]
				- prodMatrix[0][5] - prodMatrix[0][6];

		// Produktion in geplanter Verkauf übertragen
		prodMatrix[1][1] = prodMatrix[0][7];
		prodMatrix[1][2] = prodMatrix[0][5];

		prodMatrix[2][1] = prodMatrix[0][7];
		prodMatrix[2][2] = prodMatrix[0][5];

		prodMatrix[1][7] = prodMatrix[1][1] + prodMatrix[1][2] + prodMatrix[1][3] - prodMatrix[1][4]
				- prodMatrix[1][5] - prodMatrix[1][6];
		prodMatrix[2][7] = prodMatrix[2][1] + prodMatrix[2][2] + prodMatrix[2][3] - prodMatrix[2][4]
				- prodMatrix[2][5] - prodMatrix[2][6];

		// Produktion in geplanter Verkauf übertragen
		prodMatrix[3][1] = prodMatrix[2][7];
		prodMatrix[3][2] = prodMatrix[2][5];

		prodMatrix[4][1] = prodMatrix[2][7];
		prodMatrix[4][2] = prodMatrix[2][5];

		prodMatrix[5][1] = prodMatrix[2][7];
		prodMatrix[5][2] = prodMatrix[2][5];

		prodMatrix[3][7] = prodMatrix[3][1] + prodMatrix[3][2] + prodMatrix[3][3] - prodMatrix[3][4]
				- prodMatrix[3][5] - prodMatrix[3][6];
		prodMatrix[4][7] = prodMatrix[4][1] + prodMatrix[4][2] + prodMatrix[4][3] - prodMatrix[4][4]
				- prodMatrix[4][5] - prodMatrix[4][6];
		prodMatrix[5][7] = prodMatrix[5][1] + prodMatrix[5][2] + prodMatrix[5][3] - prodMatrix[5][4]
				- prodMatrix[5][5] - prodMatrix[5][6];

		// Produktion in geplanter Verkauf übertragen
		prodMatrix[6][1] = prodMatrix[5][7];
		prodMatrix[6][2] = prodMatrix[5][5];

		prodMatrix[7][1] = prodMatrix[5][7];
		prodMatrix[7][2] = prodMatrix[5][5];

		prodMatrix[8][1] = prodMatrix[5][7];
		prodMatrix[8][2] = prodMatrix[5][5];

		prodMatrix[6][7] = prodMatrix[6][1] + prodMatrix[6][2] + prodMatrix[6][3] - prodMatrix[6][4]
				- prodMatrix[6][5] - prodMatrix[6][6];
		prodMatrix[7][7] = prodMatrix[7][1] + prodMatrix[7][2] + prodMatrix[7][3] - prodMatrix[7][4]
				- prodMatrix[7][5] - prodMatrix[7][6];
		prodMatrix[8][7] = prodMatrix[8][1] + prodMatrix[8][2] + prodMatrix[8][3] - prodMatrix[8][4]
				- prodMatrix[8][5] - prodMatrix[8][6];

		// Produktion in geplanter Verkauf übertragen
		prodMatrix[9][1] = prodMatrix[8][7];
		prodMatrix[9][2] = prodMatrix[8][5];

		prodMatrix[10][1] = prodMatrix[8][7];
		prodMatrix[10][2] = prodMatrix[8][5];

		prodMatrix[11][1] = prodMatrix[8][7];
		prodMatrix[11][2] = prodMatrix[8][5];

		prodMatrix[9][7] = prodMatrix[9][1] + prodMatrix[9][2] + prodMatrix[9][3] - prodMatrix[9][4]
				- prodMatrix[9][5] - prodMatrix[9][6];
		prodMatrix[10][7] = prodMatrix[10][1] + prodMatrix[10][2] + prodMatrix[10][3]
				- prodMatrix[10][4] - prodMatrix[10][5] - prodMatrix[10][6];
		prodMatrix[11][7] = prodMatrix[11][1] + prodMatrix[11][2] + prodMatrix[11][3]
				- prodMatrix[11][4] - prodMatrix[11][5] - prodMatrix[11][6];

		if (produktionsfall == 1)
			p1KaufteileVerwendung = generiereKaufteileVerwendung(produktionsfall, p1Prod);
		if (produktionsfall == 2)
			p2KaufteileVerwendung = generiereKaufteileVerwendung(produktionsfall, p2Prod);
		if (produktionsfall == 3)
			p3KaufteileVerwendung = generiereKaufteileVerwendung(produktionsfall, p3Prod);

		kaufteileVerwendungMerged = mergeKautfteileVerwendung(p1KaufteileVerwendung,
				p2KaufteileVerwendung, p3KaufteileVerwendung);
		return prodMatrix;
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
			matrix[zeilenNummer][5] = artikelMenge;
		}
	}

	private static void ersetzeInBearbeitungItems(int[][] matrix, Integer artikelNummer,
			Integer artikelMenge) {
		int zeilenNummer = artikelVorhanden(matrix, artikelNummer);
		// 12 bedeutet nicht vorhanden, da matrix nur bis 12 geht
		if (zeilenNummer != 12) {
			matrix[zeilenNummer][6] = artikelMenge;
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

			if (workplace.getContent() != null) {
				List<Serializable> content = workplace.getContent();
				for (Serializable serializable : content) {
					@SuppressWarnings("unchecked")
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
				int intValue = article.getAmount()
						.intValue();
				if (intValue < 0) {
					if (intValue > -64) {
						intValue = intValue + 64;
					} else if (intValue > -128) {
						intValue = intValue + 128;
					} else if (intValue > -256) {
						intValue = intValue + 256;
					} else if (intValue > -512) {
						intValue = intValue + 512;
					} else if (intValue > -1024) {
						intValue = intValue + 1024;
					} else if (intValue > -2048) {
						intValue = intValue + 2048;
					} else if (intValue > -4096) {
						intValue = intValue + 4096;

					} else if (intValue > -8192) {
						intValue = intValue + 8192;
					} else if (intValue > -16384) {
						intValue = intValue + 16384;
					}
					// else if (intValue > -32768) {
					// intValue = intValue + 32768;
					// }
					else if (intValue > -65536) {
						intValue = intValue + 65536;
					}
				}
				return intValue;
			}
		}
		return 0;
	}
}
