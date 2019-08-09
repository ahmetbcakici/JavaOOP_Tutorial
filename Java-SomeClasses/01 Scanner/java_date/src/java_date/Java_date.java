/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ABUGRA
 */
public class Java_date {

    
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println("Anlık tarih : "+tarih);
        LocalTime zaman = LocalTime.now();
        System.out.println("Anlık zaman : "+zaman);
        
        
        LocalDateTime tarihzaman = LocalDateTime.now();
        System.out.println("Anlık tarih&zaman bilgisi : "+tarihzaman);
        DateTimeFormatter formatnesnem = DateTimeFormatter.ofPattern("MM-dd-yyyy HH");
        
        String formatlanmistarih = tarihzaman.format(formatnesnem);
        System.out.println("Formatlanmış tarih&zaman bilgim : "+formatlanmistarih);
    }
    
}
