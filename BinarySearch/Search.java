package Search;

import java.util.ArrayList;


public class Search extends Main{
	
	public static int sonDeg,ortDeg,key,kontrol,ortIndis,ilkDeg=0;
	
	public Search(int sonDeg,int key) {
		this.sonDeg=sonDeg;
		this.key=key;
		ArrayOlustur( sonDeg, key);
	}
	

	
	
	public  static int Ara(int sonDeg,int key,int ortDeg,int ilkDeg) {

		ortDeg=(sonDeg+ilkDeg)/2;
		
		 if(key<liste[ortDeg]) {
			sonDeg=ortDeg-1;
			return Ara(sonDeg,key,ortDeg,ilkDeg);
			
		}
		else if(key>liste[ortDeg]) {
			ilkDeg=ortDeg+1;
			return Ara(sonDeg,key,ortDeg,ilkDeg);
		}
		else if(key==liste[ortDeg]) {
			System.out.println("Aranan deger= "+key+" Ýndis= "+(ortDeg+1));
			
		}
		return 0;
	}
}
