package ui;
import model.*;
import java.util.*;
public class Main{

	public static Scanner sc = new Scanner(System.in);

	public static void main (String[] args){

		System.out.println("*************************************************");
		System.out.println("*********          BIENVENIDO           *********");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("((((((((((((((((/((((((((((((((((((((((((((((((((");
		System.out.println("(((/  .(((((((*  .((((((*        (((((/      /(((");
		System.out.println("(((/   .((((((.  .(((((   ,((((((((((*  .((((((((");
		System.out.println("(((/    /((((/   .((((/  ,(((((((((((.  /((((((((");
		System.out.println("(((/     ((((*   .((((*  ,(((((((((((/   ((((((((");
		System.out.println("(((/  *  *(((     ((((*  ,((((((((((((,  .(((((((");
		System.out.println("(((/  /.  ((*     ((((*  *(((((((((((((,   ((((((");
		System.out.println("(((/  //  ,(  .   ((((*  *((((((((((((((/   /((((");
		System.out.println("(((/  *(*  ,  (   ((((*  *((((((((((((((((   /(((");
		System.out.println("(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   (((");
		System.out.println("(((/  .((    ((   /((((  .(((((((((((((((((.  /((");
		System.out.println("(((/  .((.  .((.  *((((,  *((((((((((((((((   /((");
		System.out.println("(((/  .((((((((.  *(((((   *((((/,/(((((((/   (((");
		System.out.println("(((/  .((((((((.  *((((((.        *((   .   .((((");
		System.out.println("(((((((((((((((/*/((((((((((///(((((((////(((((((");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("               ./(###((///((###(*                ");
		System.out.println("           *#(,                   *((,           ");
		System.out.println("        ,#/                           ((         ");
		System.out.println("      .#*          .**/////*,.          ((       ");
		System.out.println("     *(.      .//////////////////*       *#      ");
		System.out.println("    .#,     *///////////////////////,     /(     ");
		System.out.println("    /(    *///////////////////////////    .#.    ");
		System.out.println("  ,/////,*/////////////////////////////,*////*.  ");
		System.out.println("  /////////////////////////*,...,/////////////,  ");
		System.out.println("  //////*,,,********,,.............,,,,,//////,  ");
		System.out.println("  //////*.........//*........//*.......,//////,  ");
		System.out.println("  //////*.........,,.........,,........,//////,  ");
		System.out.println("  //////*..............................,//////,  ");
		System.out.println("   *///*  ........,/.........**.......  .*///,   ");
		System.out.println("            .......,/*.....,/*.......            ");
		System.out.println("               ........,,,,.......               ");
		System.out.println("                    .........                    ");
		System.out.println("     											 ");


		boolean stop = false;
		boolean goLogin = false;
		boolean goMenu = false;
		while (!stop){
			System.out.println(login());
		}
	}


	private static String login(){
		String message;
		message="*************************************************\n";
		message+="*************************************************\n";
		message+="*************************************************\n";
		message+="**************                     **************\n";
		message+="**************   INICIAR SESION    **************\n";
		message+="**************                     **************\n";
		message+="*************************************************\n";
		message+="***                                           ***\n";
		message+="*** (1) ABRIR SESION                          ***\n";
		message+="*** (2) CREAR USUARIO                         ***\n";
		message+="*** (3) CERRAR                                ***\n";
		message+="***                                           ***\n";
		message+="*************************************************\n";
		message+="*************************************************\n";
		return message;
	}
	
		
}