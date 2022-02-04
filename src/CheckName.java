import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

// #5 Class Check Name

public class CheckName {
    private String nameComputer;

    //   switch for boolean type of variable, they work in method runCheckName()
    private boolean gun = false;
    private boolean indexSP = false;
    private boolean mto = false;

    //   final variable ABBREVIATION for General National Police of Ukraine, it is from instruction
    private final ArrayList<String> AB_LIST_GUNPU = new ArrayList<String>(Arrays.asList("CA", "KI", "VN", "VL", "DP",
            "DN", "ZT", "ZK", "ZP", "IF", "KV", "KG", "LG", "LV", "MK", "OD", "PL", "RV", "SU", "TP", "KH", "KN", "KM",
            "CK", "CN", "CV", "CR"));

    //   final variable INDEX of structural units of the apparatus
    private final ArrayList<Integer> INDEX_LIST_SPA = new ArrayList<Integer>(Arrays.asList(11, 12, 13, 14, 15,
            16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 40, 41, 42, 43,
            44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58));

    //   final variable ABBREVIATION for MTOU
    private final  ArrayList<String> AB_LIST_MTOU = new ArrayList<>(Arrays.asList("VI","GA","ZM","MG","TL","HM","VL",
            "KK","KE","LU","DP","KA","KV","NI","NM","PG","SN","BM","VO","GR","DN","KL","KT","MP","PV","BV","ZT","KN",
            "NV","BK","MK","RH","TK","UZ","HS","BD","VS","ZP","ML","PL","VH","IF","KS","KM","KO","ND","BC","BR","BS",
            "BI","VG","OH","FS","GL","KP","NU","OK","AC","DV","LG","RV","ST","SV","SR","SK","DG","ZK","LV","SB","SC",
            "CV","IV","BT","VZ","MV","PM","BE","BG","BL","IZ","OD","PD","RD","KR","LB","MR","PT","VR","DB","RN","SE",
            "KU","OT","RO","SU","SH","KC","TP","CR","BO","IM","KG","KY","LO","KH","CU","BU","GN","NK","SD","KB","KD",
            "KI","SP","ZV","ZL","UM","CK","VN","DS","CN","KW","NZ","NS","PR","CG"));


    public CheckName() throws UnknownHostException {
        runCheckName();
    }

    //   this method get Name of Computer, and check for a correct name, in first IF(){} we are taking name and get his
//   symbols' length, then split it on regex "-" for pattern name
    private void runCheckName() throws UnknownHostException {

//        nameComputer = InetAddress.getLocalHost().getHostName();
        nameComputer = "DES-ABR";
//        nameComputer = "KN-17-230123";
//        nameComputer = "CA-17-230123";
//        nameComputer = "KN-17-ZP-230123";
//        nameComputer = "DESKTOP-1I8SPO6";

// checked the first index s[0] on equals with the final variable ABBREVIATION for General National Police of Ukraine, if yes
// for boolean variable guт assign true and break in cycle, then we are checking second index from mass, first inside - parse s[second]
// to Integer and if s[second] equals with INDEX_LIST_SPA, boolean variable indexSP assign  true and break from cycle,
// IF name have 12 symbols program throw new Form with sample name;

        if (nameComputer.length() == 12){
            String[] s = nameComputer.split("-");


            for (String cell : AB_LIST_GUNPU){
                if (s[0].equals(cell)){

                    gun = true;
                    break;
                }
            }

            if (gun){
                try {
                    Integer.parseInt(s[1]);

                    for (Integer cell : INDEX_LIST_SPA){
                        if (Integer.parseInt(s[1]) == cell){

                            indexSP = true;
                            break;
                        }
                    }

                } catch (NumberFormatException NOP){}
            }


//  IF gun & indexSP equals true throw new FORM with sample name
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (gun & indexSP){

                new  ViewNamePCForUser(nameComputer, gun, indexSP);
                gun = false;
                indexSP = false;

            } else {
                new ViewNamePCForUser(nameComputer, false);
            }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// IF name have 15 symbols program throw new Form with sample name;
        } else if (nameComputer.length() == 15) {
            String[] s = nameComputer.split("-");


            for (String cell : AB_LIST_GUNPU){
                if (s[0].equals(cell)){

                    gun = true;
                    break;
                }
            }

            if (gun){
                try {
                    Integer.parseInt(s[1]);

                    for (Integer cell : INDEX_LIST_SPA){
                        if (Integer.parseInt(s[1]) == cell){

                            indexSP = true;
                            break;
                        }
                    }

                } catch (NumberFormatException NOP){}
            }

            if (indexSP){

                for (String cell : AB_LIST_MTOU){
                    if (s[2].equals(cell)){

                        mto = true;
                        break;
                    }
                }

            }



//  IF gun & indexSP equals true throw new FORM with sample name
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (gun & indexSP & mto){


                new  ViewNamePCForUser(nameComputer, gun, indexSP, mto);

                gun = false;
                indexSP = false;
                mto = false;
            } else {
                new ViewNamePCForUser(nameComputer, false);
            }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        } else {

            new  ViewNamePCForUser(nameComputer, false);

        }


    }




}
