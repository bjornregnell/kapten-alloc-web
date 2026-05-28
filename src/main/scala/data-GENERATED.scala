package kaptenallocweb
val dataGeneratedFromKaptenAlloc: Seq[String] = """
-------------------------------------------------------------
del |datum     |dag|kl   |typ      |grupp|rum     |handledare
-------------------------------------------------------------
Prog|2026-09-02|ons|15:15|Resurstid|D1.01|Elg     |ALL       
Prog|2026-09-02|ons|15:15|Resurstid|D1.02|Hacke   |SAJ       
Prog|2026-09-02|ons|15:15|Resurstid|D1.03|Panter  |AXF       
Prog|2026-09-02|ons|15:15|Resurstid|D1.04|Ravel   |FEA       
Prog|2026-09-02|ons|15:15|Resurstid|D1.09|Falk    |ALA       
Prog|2026-09-02|ons|15:15|Resurstid|D1.10|Val     |JUA       
Prog|2026-09-02|ons|15:15|Resurstid|D1.11|Varg    |POS       
Prog|2026-09-02|ons|15:15|Resurstid|D1.12|Alfa    |ANP       
Prog|2026-09-02|ons|15:15|Resurstid|D1.13|Beta    |CLB       
Prog|2026-09-02|ons|15:15|Resurstid|D1.14|Gamma   |LIL       
Dod |2026-09-03|tor|10:15|DodLabb  |C1.01|Alfa    |MAK       
Dod |2026-09-03|tor|10:15|DodLabb  |C1.02|Beta    |ALS       
Dod |2026-09-03|tor|10:15|DodLabb  |C1.03|Gamma   |EDJ       
Dod |2026-09-03|tor|10:15|DodLabb  |D1.05|Falk    |ALW       
Dod |2026-09-03|tor|10:15|DodLabb  |D1.06|Val     |ANM       
Dod |2026-09-03|tor|10:15|DodLabb  |D1.07|Varg    |ALL       
Dod |2026-09-03|tor|10:15|DodLabb  |D1.08|Elg     |SAJ       
Dod |2026-09-03|tor|10:15|DodLabb  |D1.09|Hacke   |ALA       
Dod |2026-09-03|tor|10:15|DodLabb  |D1.10|Panter  |JUA       
Dod |2026-09-03|tor|10:15|DodLabb  |D1.11|Ravel   |AXE       
Prog|2026-09-03|tor|13:15|Resurstid|D1.05|Alfa    |ALW       
Prog|2026-09-03|tor|13:15|Resurstid|D1.06|Beta    |ANM       
Prog|2026-09-03|tor|13:15|Resurstid|D1.07|Elg     |NIM       
Prog|2026-09-03|tor|13:15|Resurstid|D1.08|Gamma   |DAA       
Dod |2026-09-03|tor|13:15|DodLabb  |D1.01|Elgkalv |ALL       
Dod |2026-09-03|tor|13:15|DodLabb  |D1.02|Hacke   |SAJ       
Dod |2026-09-03|tor|13:15|DodLabb  |D1.03|Panter  |AXF       
Dod |2026-09-03|tor|13:15|DodLabb  |D1.04|Ravel   |ANP       
Prog|2026-09-03|tor|15:15|Resurstid|C1.01|Hacke   |MAK       
Prog|2026-09-03|tor|15:15|Resurstid|C1.02|Panter  |ALS       
Prog|2026-09-03|tor|15:15|Resurstid|C1.03|Ravel   |VAB       
Prog|2026-09-03|tor|15:15|Resurstid|C1.04|Falk    |CLB       
Prog|2026-09-03|tor|15:15|Resurstid|C1.05|Val     |EDJ       
Prog|2026-09-03|tor|15:15|Resurstid|C1.06|Varg    |WIS       
Prog|2026-09-04|fre|10:15|ProgLabb |D1.01|Alfa    |ALL       
Prog|2026-09-04|fre|10:15|ProgLabb |D1.02|Beta    |SAJ       
Prog|2026-09-04|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-09-04|fre|10:15|ProgLabb |D1.04|Gamma   |POS       
Prog|2026-09-04|fre|10:15|ProgLabb |D1.05|Hacke   |ALW       
Prog|2026-09-04|fre|10:15|ProgLabb |D1.06|Val     |ANM       
Prog|2026-09-04|fre|10:15|ProgLabb |D1.07|Varg    |NIM       
Prog|2026-09-04|fre|10:15|ProgLabb |XA1  |Ambulans|WIS       
Prog|2026-09-04|fre|10:15|ProgLabb |XA2  |Ambulans|EDJ       
Prog|2026-09-04|fre|10:15|ProgLabb |XA3  |Ambulans|CLB       
Dod |2026-09-04|fre|10:15|DodLabb  |D1.12|Elgkalv |ANP       
Dod |2026-09-04|fre|10:15|DodLabb  |D1.13|Panter  |ALA       
Dod |2026-09-04|fre|10:15|DodLabb  |D1.14|Ravel   |DAA       
Prog|2026-09-04|fre|13:15|ProgLabb |D1.08|Alfa    |DAA       
Prog|2026-09-04|fre|13:15|ProgLabb |D1.09|Beta    |ALA       
Prog|2026-09-04|fre|13:15|ProgLabb |D1.10|Falk    |MAC       
Prog|2026-09-04|fre|13:15|ProgLabb |D1.11|Gamma   |AXE       
Prog|2026-09-04|fre|13:15|ProgLabb |D1.12|Hacke   |ANP       
Prog|2026-09-04|fre|13:15|ProgLabb |D1.13|Val     |VIB       
Prog|2026-09-04|fre|13:15|ProgLabb |D1.14|Varg    |LIL       
Prog|2026-09-04|fre|13:15|ProgLabb |XA1  |Ambulans|FEA       
Prog|2026-09-04|fre|13:15|ProgLabb |XA2  |Ambulans|SOG       
Prog|2026-09-04|fre|13:15|ProgLabb |XA3  |Ambulans|CLB       
Dod |2026-09-04|fre|13:15|DodLabb  |C1.04|Elgkalv |ERW       
Dod |2026-09-04|fre|13:15|DodLabb  |C1.05|Panter  |EDJ       
Dod |2026-09-04|fre|13:15|DodLabb  |C1.06|Ravel   |WIS       
Prog|2026-09-04|fre|15:15|ProgLabb |C1.01|Alfa    |MAK       
Prog|2026-09-04|fre|15:15|ProgLabb |C1.02|Beta    |ALS       
Prog|2026-09-04|fre|15:15|ProgLabb |C1.03|Falk    |VAB       
Prog|2026-09-04|fre|15:15|ProgLabb |C1.04|Gamma   |ERW       
Prog|2026-09-04|fre|15:15|ProgLabb |C1.05|Val     |EDJ       
Prog|2026-09-04|fre|15:15|ProgLabb |C1.06|Varg    |WIS       
Prog|2026-09-04|fre|15:15|ProgLabb |XA1  |Ambulans|FEA       
Prog|2026-09-04|fre|15:15|ProgLabb |XA2  |Ambulans|SOG       
Prog|2026-09-04|fre|15:15|ProgLabb |XA3  |Ambulans|CLB       
Prog|2026-09-09|ons|15:15|Resurstid|D1.01|Elg     |ALL       
Prog|2026-09-09|ons|15:15|Resurstid|D1.02|Hacke   |SAJ       
Prog|2026-09-09|ons|15:15|Resurstid|D1.03|Panter  |AXF       
Prog|2026-09-09|ons|15:15|Resurstid|D1.04|Ravel   |MAF       
Prog|2026-09-09|ons|15:15|Resurstid|D1.09|Falk    |ALA       
Prog|2026-09-09|ons|15:15|Resurstid|D1.10|Val     |JUA       
Prog|2026-09-09|ons|15:15|Resurstid|D1.11|Varg    |POS       
Prog|2026-09-09|ons|15:15|Resurstid|D1.12|Alfa    |ANP       
Prog|2026-09-09|ons|15:15|Resurstid|D1.13|Beta    |VIB       
Prog|2026-09-09|ons|15:15|Resurstid|D1.14|Gamma   |LIL       
Dod |2026-09-10|tor|10:15|DodLabb  |C1.01|Alfa    |MAK       
Dod |2026-09-10|tor|10:15|DodLabb  |C1.02|Beta    |ALS       
Dod |2026-09-10|tor|10:15|DodLabb  |C1.03|Gamma   |AXE       
Dod |2026-09-10|tor|10:15|DodLabb  |D1.05|Falk    |ALW       
Dod |2026-09-10|tor|10:15|DodLabb  |D1.06|Val     |ANM       
Dod |2026-09-10|tor|10:15|DodLabb  |D1.07|Varg    |MAF       
Dod |2026-09-10|tor|10:15|DodLabb  |D1.08|Elg     |DAA       
Dod |2026-09-10|tor|10:15|DodLabb  |D1.09|Hacke   |ALA       
Dod |2026-09-10|tor|10:15|DodLabb  |D1.10|Panter  |JUA       
Dod |2026-09-10|tor|10:15|DodLabb  |D1.11|Ravel   |MAC       
Prog|2026-09-10|tor|13:15|Resurstid|D1.05|Alfa    |ALW       
Prog|2026-09-10|tor|13:15|Resurstid|D1.06|Beta    |ANM       
Prog|2026-09-10|tor|13:15|Resurstid|D1.07|Elg     |NIM       
Prog|2026-09-10|tor|13:15|Resurstid|D1.08|Gamma   |DAA       
Dod |2026-09-10|tor|13:15|DodLabb  |D1.01|Elgkalv |LIL       
Dod |2026-09-10|tor|13:15|DodLabb  |D1.02|Hacke   |SAJ       
Dod |2026-09-10|tor|13:15|DodLabb  |D1.03|Panter  |AXF       
Dod |2026-09-10|tor|13:15|DodLabb  |D1.04|Ravel   |MAF       
Prog|2026-09-10|tor|15:15|Resurstid|C1.01|Hacke   |AXE       
Prog|2026-09-10|tor|15:15|Resurstid|C1.02|Panter  |ALS       
Prog|2026-09-10|tor|15:15|Resurstid|C1.03|Ravel   |VAB       
Prog|2026-09-10|tor|15:15|Resurstid|C1.04|Falk    |ERW       
Prog|2026-09-10|tor|15:15|Resurstid|C1.05|Val     |EDJ       
Prog|2026-09-10|tor|15:15|Resurstid|C1.06|Varg    |WIS       
Dod |2026-09-11|fre|10:15|DodLabb  |D1.12|Elgkalv |ANP       
Dod |2026-09-11|fre|10:15|DodLabb  |D1.13|Panter  |ALW       
Dod |2026-09-11|fre|10:15|DodLabb  |D1.14|Ravel   |ARH       
Dod |2026-09-11|fre|13:15|DodLabb  |C1.04|Elgkalv |SAJ       
Dod |2026-09-11|fre|13:15|DodLabb  |C1.05|Panter  |EDJ       
Dod |2026-09-11|fre|13:15|DodLabb  |C1.06|Ravel   |WIS       
Prog|2026-09-16|ons|15:15|Resurstid|D1.01|Elg     |ALL       
Prog|2026-09-16|ons|15:15|Resurstid|D1.02|Hacke   |SAJ       
Prog|2026-09-16|ons|15:15|Resurstid|D1.03|Panter  |AXF       
Prog|2026-09-16|ons|15:15|Resurstid|D1.04|Ravel   |MAF       
Prog|2026-09-16|ons|15:15|Resurstid|D1.09|Falk    |ALA       
Prog|2026-09-16|ons|15:15|Resurstid|D1.10|Val     |JUA       
Prog|2026-09-16|ons|15:15|Resurstid|D1.11|Varg    |SOG       
Prog|2026-09-16|ons|15:15|Resurstid|D1.12|Alfa    |ANP       
Prog|2026-09-16|ons|15:15|Resurstid|D1.13|Beta    |VIB       
Prog|2026-09-16|ons|15:15|Resurstid|D1.14|Gamma   |LIL       
Prog|2026-09-17|tor|13:15|Resurstid|D1.05|Alfa    |ALW       
Prog|2026-09-17|tor|13:15|Resurstid|D1.06|Beta    |ANM       
Prog|2026-09-17|tor|13:15|Resurstid|D1.07|Elg     |NIM       
Prog|2026-09-17|tor|13:15|Resurstid|D1.08|Gamma   |DAA       
Prog|2026-09-17|tor|15:15|Resurstid|C1.01|Hacke   |AXE       
Prog|2026-09-17|tor|15:15|Resurstid|C1.02|Panter  |ALS       
Prog|2026-09-17|tor|15:15|Resurstid|C1.03|Ravel   |VAB       
Prog|2026-09-17|tor|15:15|Resurstid|C1.04|Falk    |ERW       
Prog|2026-09-17|tor|15:15|Resurstid|C1.05|Val     |EDJ       
Prog|2026-09-17|tor|15:15|Resurstid|C1.06|Varg    |WIS       
Prog|2026-09-18|fre|10:15|ProgLabb |D1.01|Alfa    |ALL       
Prog|2026-09-18|fre|10:15|ProgLabb |D1.02|Beta    |SAJ       
Prog|2026-09-18|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-09-18|fre|10:15|ProgLabb |D1.04|Gamma   |MAF       
Prog|2026-09-18|fre|10:15|ProgLabb |D1.05|Hacke   |ALW       
Prog|2026-09-18|fre|10:15|ProgLabb |D1.06|Val     |ANM       
Prog|2026-09-18|fre|10:15|ProgLabb |D1.07|Varg    |NIM       
Prog|2026-09-18|fre|10:15|ProgLabb |XA1  |Ambulans|FEA       
Prog|2026-09-18|fre|10:15|ProgLabb |XA2  |Ambulans|POS       
Prog|2026-09-18|fre|10:15|ProgLabb |XA3  |Ambulans|CLB       
Prog|2026-09-18|fre|13:15|ProgLabb |D1.08|Alfa    |DAA       
Prog|2026-09-18|fre|13:15|ProgLabb |D1.09|Beta    |ALA       
Prog|2026-09-18|fre|13:15|ProgLabb |D1.10|Falk    |JUA       
Prog|2026-09-18|fre|13:15|ProgLabb |D1.11|Gamma   |POS       
Prog|2026-09-18|fre|13:15|ProgLabb |D1.12|Hacke   |ANP       
Prog|2026-09-18|fre|13:15|ProgLabb |D1.13|Val     |VIB       
Prog|2026-09-18|fre|13:15|ProgLabb |D1.14|Varg    |EMM       
Prog|2026-09-18|fre|13:15|ProgLabb |XA1  |Ambulans|FEA       
Prog|2026-09-18|fre|13:15|ProgLabb |XA2  |Ambulans|SOG       
Prog|2026-09-18|fre|13:15|ProgLabb |XA3  |Ambulans|CLB       
Prog|2026-09-18|fre|15:15|ProgLabb |C1.01|Alfa    |MAK       
Prog|2026-09-18|fre|15:15|ProgLabb |C1.02|Beta    |ALS       
Prog|2026-09-18|fre|15:15|ProgLabb |C1.03|Falk    |VAB       
Prog|2026-09-18|fre|15:15|ProgLabb |C1.04|Gamma   |ERW       
Prog|2026-09-18|fre|15:15|ProgLabb |C1.05|Val     |EDJ       
Prog|2026-09-18|fre|15:15|ProgLabb |C1.06|Varg    |WIS       
Prog|2026-09-18|fre|15:15|ProgLabb |XA1  |Ambulans|FEA       
Prog|2026-09-18|fre|15:15|ProgLabb |XA2  |Ambulans|SOG       
Prog|2026-09-18|fre|15:15|ProgLabb |XA3  |Ambulans|CLB       
Prog|2026-09-23|ons|15:15|Resurstid|D1.01|Elg     |ALL       
Prog|2026-09-23|ons|15:15|Resurstid|D1.02|Hacke   |SAJ       
Prog|2026-09-23|ons|15:15|Resurstid|D1.03|Panter  |AXF       
Prog|2026-09-23|ons|15:15|Resurstid|D1.04|Ravel   |MAF       
Prog|2026-09-23|ons|15:15|Resurstid|D1.09|Falk    |ALA       
Prog|2026-09-23|ons|15:15|Resurstid|D1.10|Val     |JUA       
Prog|2026-09-23|ons|15:15|Resurstid|D1.11|Varg    |POS       
Prog|2026-09-23|ons|15:15|Resurstid|D1.12|Alfa    |ANP       
Prog|2026-09-23|ons|15:15|Resurstid|D1.13|Beta    |VIB       
Prog|2026-09-23|ons|15:15|Resurstid|D1.14|Gamma   |LIL       
Prog|2026-09-24|tor|13:15|Resurstid|D1.05|Alfa    |ALW       
Prog|2026-09-24|tor|13:15|Resurstid|D1.06|Beta    |ANM       
Prog|2026-09-24|tor|13:15|Resurstid|D1.07|Elg     |NIM       
Prog|2026-09-24|tor|13:15|Resurstid|D1.08|Gamma   |DAA       
Prog|2026-09-24|tor|15:15|Resurstid|C1.01|Hacke   |MAC       
Prog|2026-09-24|tor|15:15|Resurstid|C1.02|Panter  |ALS       
Prog|2026-09-24|tor|15:15|Resurstid|C1.03|Ravel   |VAB       
Prog|2026-09-24|tor|15:15|Resurstid|C1.04|Falk    |ERW       
Prog|2026-09-24|tor|15:15|Resurstid|C1.05|Val     |EDJ       
Prog|2026-09-24|tor|15:15|Resurstid|C1.06|Varg    |WIS       
Prog|2026-09-25|fre|10:15|ProgLabb |D1.01|Alfa    |ALL       
Prog|2026-09-25|fre|10:15|ProgLabb |D1.02|Beta    |SAJ       
Prog|2026-09-25|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-09-25|fre|10:15|ProgLabb |D1.04|Gamma   |MAF       
Prog|2026-09-25|fre|10:15|ProgLabb |D1.05|Hacke   |ALW       
Prog|2026-09-25|fre|10:15|ProgLabb |D1.06|Val     |ANM       
Prog|2026-09-25|fre|10:15|ProgLabb |D1.07|Varg    |NIM       
Prog|2026-09-25|fre|10:15|ProgLabb |XA1  |Ambulans|FEA       
Prog|2026-09-25|fre|10:15|ProgLabb |XA2  |Ambulans|SOG       
Prog|2026-09-25|fre|10:15|ProgLabb |XA3  |Ambulans|ERE       
Prog|2026-09-25|fre|13:15|ProgLabb |D1.08|Alfa    |DAA       
Prog|2026-09-25|fre|13:15|ProgLabb |D1.09|Beta    |ALA       
Prog|2026-09-25|fre|13:15|ProgLabb |D1.10|Falk    |JUA       
Prog|2026-09-25|fre|13:15|ProgLabb |D1.11|Gamma   |AXE       
Prog|2026-09-25|fre|13:15|ProgLabb |D1.12|Hacke   |ANP       
Prog|2026-09-25|fre|13:15|ProgLabb |D1.13|Val     |VIB       
Prog|2026-09-25|fre|13:15|ProgLabb |D1.14|Varg    |ARH       
Prog|2026-09-25|fre|13:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-09-25|fre|13:15|ProgLabb |XA2  |Ambulans|SOG       
Prog|2026-09-25|fre|13:15|ProgLabb |XA3  |Ambulans|ERE       
Prog|2026-09-25|fre|15:15|ProgLabb |C1.01|Alfa    |MAK       
Prog|2026-09-25|fre|15:15|ProgLabb |C1.02|Beta    |ALS       
Prog|2026-09-25|fre|15:15|ProgLabb |C1.03|Falk    |VAB       
Prog|2026-09-25|fre|15:15|ProgLabb |C1.04|Gamma   |ERW       
Prog|2026-09-25|fre|15:15|ProgLabb |C1.05|Val     |EDJ       
Prog|2026-09-25|fre|15:15|ProgLabb |C1.06|Varg    |WIS       
Prog|2026-09-25|fre|15:15|ProgLabb |XA1  |Ambulans|ERE       
Prog|2026-09-25|fre|15:15|ProgLabb |XA2  |Ambulans|MAC       
Prog|2026-09-25|fre|15:15|ProgLabb |XA3  |Ambulans|AXE       
Prog|2026-09-30|ons|15:15|Resurstid|D1.01|Elg     |ALL       
Prog|2026-09-30|ons|15:15|Resurstid|D1.02|Hacke   |SAJ       
Prog|2026-09-30|ons|15:15|Resurstid|D1.03|Panter  |AXF       
Prog|2026-09-30|ons|15:15|Resurstid|D1.04|Ravel   |MAF       
Prog|2026-09-30|ons|15:15|Resurstid|D1.09|Falk    |ALA       
Prog|2026-09-30|ons|15:15|Resurstid|D1.10|Val     |JUA       
Prog|2026-09-30|ons|15:15|Resurstid|D1.11|Varg    |POS       
Prog|2026-09-30|ons|15:15|Resurstid|D1.12|Alfa    |ANP       
Prog|2026-09-30|ons|15:15|Resurstid|D1.13|Beta    |VIB       
Prog|2026-09-30|ons|15:15|Resurstid|D1.14|Gamma   |LIL       
Prog|2026-10-01|tor|13:15|Resurstid|D1.05|Alfa    |ALW       
Prog|2026-10-01|tor|13:15|Resurstid|D1.06|Beta    |ANM       
Prog|2026-10-01|tor|13:15|Resurstid|D1.07|Elg     |NIM       
Prog|2026-10-01|tor|13:15|Resurstid|D1.08|Gamma   |DAA       
Prog|2026-10-01|tor|15:15|Resurstid|C1.01|Hacke   |ERE       
Prog|2026-10-01|tor|15:15|Resurstid|C1.02|Panter  |ALS       
Prog|2026-10-01|tor|15:15|Resurstid|C1.03|Ravel   |VAB       
Prog|2026-10-01|tor|15:15|Resurstid|C1.04|Falk    |ERW       
Prog|2026-10-01|tor|15:15|Resurstid|C1.05|Val     |EDJ       
Prog|2026-10-01|tor|15:15|Resurstid|C1.06|Varg    |WIS       
Prog|2026-10-02|fre|10:15|ProgLabb |D1.01|Alfa    |ALL       
Prog|2026-10-02|fre|10:15|ProgLabb |D1.02|Beta    |SAJ       
Prog|2026-10-02|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-10-02|fre|10:15|ProgLabb |D1.04|Gamma   |MAF       
Prog|2026-10-02|fre|10:15|ProgLabb |D1.05|Hacke   |ALW       
Prog|2026-10-02|fre|10:15|ProgLabb |D1.06|Val     |ANM       
Prog|2026-10-02|fre|10:15|ProgLabb |D1.07|Varg    |NIM       
Prog|2026-10-02|fre|10:15|ProgLabb |XA1  |Ambulans|JUA       
Prog|2026-10-02|fre|10:15|ProgLabb |XA2  |Ambulans|EDJ       
Prog|2026-10-02|fre|10:15|ProgLabb |XA3  |Ambulans|ANP       
Prog|2026-10-02|fre|13:15|ProgLabb |D1.08|Alfa    |DAA       
Prog|2026-10-02|fre|13:15|ProgLabb |D1.09|Beta    |ALA       
Prog|2026-10-02|fre|13:15|ProgLabb |D1.10|Falk    |JUA       
Prog|2026-10-02|fre|13:15|ProgLabb |D1.11|Gamma   |AXE       
Prog|2026-10-02|fre|13:15|ProgLabb |D1.12|Hacke   |ANP       
Prog|2026-10-02|fre|13:15|ProgLabb |D1.13|Val     |VIB       
Prog|2026-10-02|fre|13:15|ProgLabb |D1.14|Varg    |ERE       
Prog|2026-10-02|fre|13:15|ProgLabb |XA1  |Ambulans|ALS       
Prog|2026-10-02|fre|13:15|ProgLabb |XA2  |Ambulans|SAJ       
Prog|2026-10-02|fre|13:15|ProgLabb |XA3  |Ambulans|AXF       
Prog|2026-10-02|fre|15:15|ProgLabb |C1.01|Alfa    |MAK       
Prog|2026-10-02|fre|15:15|ProgLabb |C1.02|Beta    |ALS       
Prog|2026-10-02|fre|15:15|ProgLabb |C1.03|Falk    |VAB       
Prog|2026-10-02|fre|15:15|ProgLabb |C1.04|Gamma   |ERW       
Prog|2026-10-02|fre|15:15|ProgLabb |C1.05|Val     |EDJ       
Prog|2026-10-02|fre|15:15|ProgLabb |C1.06|Varg    |WIS       
Prog|2026-10-02|fre|15:15|ProgLabb |XA1  |Ambulans|AXE       
Prog|2026-10-02|fre|15:15|ProgLabb |XA2  |Ambulans|EMM       
Prog|2026-10-02|fre|15:15|ProgLabb |XA3  |Ambulans|ARH       
Prog|2026-10-07|ons|15:15|Resurstid|D1.01|Elg     |ALL       
Prog|2026-10-07|ons|15:15|Resurstid|D1.02|Hacke   |SAJ       
Prog|2026-10-07|ons|15:15|Resurstid|D1.03|Panter  |AXF       
Prog|2026-10-07|ons|15:15|Resurstid|D1.04|Ravel   |MAF       
Prog|2026-10-07|ons|15:15|Resurstid|D1.09|Falk    |ALA       
Prog|2026-10-07|ons|15:15|Resurstid|D1.10|Val     |JUA       
Prog|2026-10-07|ons|15:15|Resurstid|D1.11|Varg    |EMM       
Prog|2026-10-07|ons|15:15|Resurstid|D1.12|Alfa    |ANP       
Prog|2026-10-07|ons|15:15|Resurstid|D1.13|Beta    |VIB       
Prog|2026-10-07|ons|15:15|Resurstid|D1.14|Gamma   |LIL       
Prog|2026-10-08|tor|13:15|Resurstid|D1.05|Alfa    |ALW       
Prog|2026-10-08|tor|13:15|Resurstid|D1.06|Beta    |ANM       
Prog|2026-10-08|tor|13:15|Resurstid|D1.07|Elg     |NIM       
Prog|2026-10-08|tor|13:15|Resurstid|D1.08|Gamma   |DAA       
Prog|2026-10-08|tor|15:15|Resurstid|C1.01|Hacke   |ARH       
Prog|2026-10-08|tor|15:15|Resurstid|C1.02|Panter  |ALS       
Prog|2026-10-08|tor|15:15|Resurstid|C1.03|Ravel   |VAB       
Prog|2026-10-08|tor|15:15|Resurstid|C1.04|Falk    |ERW       
Prog|2026-10-08|tor|15:15|Resurstid|C1.05|Val     |EDJ       
Prog|2026-10-08|tor|15:15|Resurstid|C1.06|Varg    |WIS       
Prog|2026-10-09|fre|10:15|ProgLabb |D1.01|Alfa    |ALL       
Prog|2026-10-09|fre|10:15|ProgLabb |D1.02|Beta    |SAJ       
Prog|2026-10-09|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-10-09|fre|10:15|ProgLabb |D1.04|Gamma   |MAF       
Prog|2026-10-09|fre|10:15|ProgLabb |D1.05|Hacke   |ALW       
Prog|2026-10-09|fre|10:15|ProgLabb |D1.06|Val     |ANM       
Prog|2026-10-09|fre|10:15|ProgLabb |D1.07|Varg    |NIM       
Prog|2026-10-09|fre|10:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-10-09|fre|10:15|ProgLabb |XA2  |Ambulans|ERE       
Prog|2026-10-09|fre|10:15|ProgLabb |XA3  |Ambulans|POS       
Prog|2026-10-09|fre|13:15|ProgLabb |D1.08|Alfa    |DAA       
Prog|2026-10-09|fre|13:15|ProgLabb |D1.09|Beta    |ALA       
Prog|2026-10-09|fre|13:15|ProgLabb |D1.10|Falk    |ARH       
Prog|2026-10-09|fre|13:15|ProgLabb |D1.11|Gamma   |POS       
Prog|2026-10-09|fre|13:15|ProgLabb |D1.12|Hacke   |ANP       
Prog|2026-10-09|fre|13:15|ProgLabb |D1.13|Val     |VIB       
Prog|2026-10-09|fre|13:15|ProgLabb |D1.14|Varg    |EMM       
Prog|2026-10-09|fre|13:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-10-09|fre|13:15|ProgLabb |XA2  |Ambulans|ERE       
Prog|2026-10-09|fre|13:15|ProgLabb |XA3  |Ambulans|VAB       
Prog|2026-10-09|fre|15:15|ProgLabb |C1.01|Alfa    |MAK       
Prog|2026-10-09|fre|15:15|ProgLabb |C1.02|Beta    |ALS       
Prog|2026-10-09|fre|15:15|ProgLabb |C1.03|Falk    |VAB       
Prog|2026-10-09|fre|15:15|ProgLabb |C1.04|Gamma   |ERW       
Prog|2026-10-09|fre|15:15|ProgLabb |C1.05|Val     |EDJ       
Prog|2026-10-09|fre|15:15|ProgLabb |C1.06|Varg    |WIS       
Prog|2026-10-09|fre|15:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-10-09|fre|15:15|ProgLabb |XA2  |Ambulans|EMM       
Prog|2026-10-09|fre|15:15|ProgLabb |XA3  |Ambulans|ERE       
Prog|2026-10-14|ons|15:15|Resurstid|D1.01|Elg     |ALL       
Prog|2026-10-14|ons|15:15|Resurstid|D1.02|Hacke   |SAJ       
Prog|2026-10-14|ons|15:15|Resurstid|D1.03|Panter  |AXF       
Prog|2026-10-14|ons|15:15|Resurstid|D1.04|Ravel   |MAF       
Prog|2026-10-14|ons|15:15|Resurstid|D1.09|Falk    |ALA       
Prog|2026-10-14|ons|15:15|Resurstid|D1.10|Val     |JUA       
Prog|2026-10-14|ons|15:15|Resurstid|D1.11|Varg    |POS       
Prog|2026-10-14|ons|15:15|Resurstid|D1.12|Alfa    |ANP       
Prog|2026-10-14|ons|15:15|Resurstid|D1.13|Beta    |VIB       
Prog|2026-10-14|ons|15:15|Resurstid|D1.14|Gamma   |LIL       
Prog|2026-10-15|tor|13:15|Resurstid|D1.05|Alfa    |ALW       
Prog|2026-10-15|tor|13:15|Resurstid|D1.06|Beta    |ANM       
Prog|2026-10-15|tor|13:15|Resurstid|D1.07|Elg     |NIM       
Prog|2026-10-15|tor|13:15|Resurstid|D1.08|Gamma   |DAA       
Prog|2026-10-15|tor|15:15|Resurstid|C1.01|Hacke   |ARH       
Prog|2026-10-15|tor|15:15|Resurstid|C1.02|Panter  |ALS       
Prog|2026-10-15|tor|15:15|Resurstid|C1.03|Ravel   |VAB       
Prog|2026-10-15|tor|15:15|Resurstid|C1.04|Falk    |ERW       
Prog|2026-10-15|tor|15:15|Resurstid|C1.05|Val     |EDJ       
Prog|2026-10-15|tor|15:15|Resurstid|C1.06|Varg    |WIS       
Prog|2026-10-16|fre|10:15|ProgLabb |D1.01|Alfa    |ALL       
Prog|2026-10-16|fre|10:15|ProgLabb |D1.02|Beta    |SAJ       
Prog|2026-10-16|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-10-16|fre|10:15|ProgLabb |D1.04|Gamma   |MAF       
Prog|2026-10-16|fre|10:15|ProgLabb |D1.05|Hacke   |ALW       
Prog|2026-10-16|fre|10:15|ProgLabb |D1.06|Val     |ANM       
Prog|2026-10-16|fre|10:15|ProgLabb |D1.07|Varg    |NIM       
Prog|2026-10-16|fre|10:15|ProgLabb |XA1  |Ambulans|EMM       
Prog|2026-10-16|fre|10:15|ProgLabb |XA2  |Ambulans|ARH       
Prog|2026-10-16|fre|10:15|ProgLabb |XA3  |Ambulans|VIB       
Prog|2026-10-16|fre|13:15|ProgLabb |D1.08|Alfa    |DAA       
Prog|2026-10-16|fre|13:15|ProgLabb |D1.09|Beta    |ALA       
Prog|2026-10-16|fre|13:15|ProgLabb |D1.10|Falk    |JUA       
Prog|2026-10-16|fre|13:15|ProgLabb |D1.11|Gamma   |POS       
Prog|2026-10-16|fre|13:15|ProgLabb |D1.12|Hacke   |ANP       
Prog|2026-10-16|fre|13:15|ProgLabb |D1.13|Val     |VIB       
Prog|2026-10-16|fre|13:15|ProgLabb |D1.14|Varg    |ARH       
Prog|2026-10-16|fre|13:15|ProgLabb |XA1  |Ambulans|ERE       
Prog|2026-10-16|fre|13:15|ProgLabb |XA2  |Ambulans|MAF       
Prog|2026-10-16|fre|13:15|ProgLabb |XA3  |Ambulans|VAB       
Prog|2026-10-16|fre|15:15|ProgLabb |C1.01|Alfa    |MAK       
Prog|2026-10-16|fre|15:15|ProgLabb |C1.02|Beta    |EMM       
Prog|2026-10-16|fre|15:15|ProgLabb |C1.03|Falk    |VAB       
Prog|2026-10-16|fre|15:15|ProgLabb |C1.04|Gamma   |ERW       
Prog|2026-10-16|fre|15:15|ProgLabb |C1.05|Val     |EDJ       
Prog|2026-10-16|fre|15:15|ProgLabb |C1.06|Varg    |WIS       
Prog|2026-10-16|fre|15:15|ProgLabb |XA1  |Ambulans|ARH       
Prog|2026-10-16|fre|15:15|ProgLabb |XA2  |Ambulans|JUA       
Prog|2026-10-16|fre|15:15|ProgLabb |XA3  |Ambulans|SAJ       
""".trim.split('\n').toSeq