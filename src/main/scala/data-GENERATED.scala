package kaptenallocweb
val dataGeneratedFromKaptenAlloc: Seq[String] = """
-------------------------------------------------------------
del |datum     |dag|kl   |typ      |grupp|rum     |handledare
-------------------------------------------------------------
Prog|2026-11-04|ons|13:15|Resurstid|D1.01|Falk    |JUA       
Prog|2026-11-04|ons|13:15|Resurstid|D1.02|Ravel   |SOG       
Prog|2026-11-04|ons|13:15|Resurstid|D1.03|Val     |AXF       
Prog|2026-11-04|ons|13:15|Resurstid|D1.04|Varg    |VIB       
Prog|2026-11-04|ons|13:15|Resurstid|D1.05|Elg     |MAC       
Prog|2026-11-04|ons|13:15|Resurstid|D1.06|Elgkalv |MAF       
Prog|2026-11-04|ons|13:15|Resurstid|D1.07|Hacke   |ERE       
Prog|2026-11-04|ons|13:15|Resurstid|D1.08|Panter  |SAJ       
Prog|2026-11-04|ons|13:15|Resurstid|D1.09|Alfa    |ALS       
Prog|2026-11-04|ons|13:15|Resurstid|D1.10|Beta    |MAK       
Prog|2026-11-04|ons|13:15|Resurstid|D1.11|Gamma   |DAA       
Dod |2026-11-05|tor|08:15|DodLabb  |D1.08|Hacke   |SAJ       
Dod |2026-11-05|tor|08:15|DodLabb  |D1.09|Panter  |ALS       
Dod |2026-11-05|tor|08:15|DodLabb  |D1.10|Ravel   |MAK       
Dod |2026-11-05|tor|08:15|DodLabb  |D1.11|Val     |DAA       
Prog|2026-11-05|tor|13:15|Resurstid|C1.01|Falk    |ARH       
Prog|2026-11-05|tor|13:15|Resurstid|C1.02|Hacke   |ERE       
Prog|2026-11-05|tor|13:15|Resurstid|C1.03|Panter  |EDJ       
Prog|2026-11-05|tor|13:15|Resurstid|C1.04|Ravel   |ALW       
Prog|2026-11-05|tor|13:15|Resurstid|C1.05|Val     |ANP       
Prog|2026-11-05|tor|13:15|Resurstid|C1.06|Varg    |ALL       
Prog|2026-11-05|tor|13:15|Resurstid|D1.12|Alfa    |ANM       
Prog|2026-11-05|tor|13:15|Resurstid|D1.13|Beta    |VAB       
Prog|2026-11-05|tor|13:15|Resurstid|D1.14|Gamma   |WIS       
Dod |2026-11-06|fre|08:15|DodLabb  |D1.01|Jupiter |ALS       
Dod |2026-11-06|fre|08:15|DodLabb  |D1.02|Mars    |SOG       
Dod |2026-11-06|fre|08:15|DodLabb  |D1.03|Saturnus|AXF       
Dod |2026-11-06|fre|08:15|DodLabb  |D1.04|Venus   |SAJ       
Dod |2026-11-06|fre|08:15|DodLabb  |D1.05|Falk    |AXE       
Dod |2026-11-06|fre|08:15|DodLabb  |D1.06|Val     |ALW       
Dod |2026-11-06|fre|08:15|DodLabb  |D1.07|Varg    |ALA       
Prog|2026-11-06|fre|10:15|ProgLabb |D1.01|Alfa    |ARH       
Prog|2026-11-06|fre|10:15|ProgLabb |D1.02|Beta    |SOG       
Prog|2026-11-06|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-11-06|fre|10:15|ProgLabb |D1.04|Gamma   |VIB       
Prog|2026-11-06|fre|10:15|ProgLabb |D1.05|Ravel   |AXE       
Prog|2026-11-06|fre|10:15|ProgLabb |D1.06|Val     |FEA       
Prog|2026-11-06|fre|10:15|ProgLabb |D1.07|Varg    |EMM       
Prog|2026-11-06|fre|10:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-11-06|fre|10:15|ProgLabb |XA2  |Ambulans|ERE       
Dod |2026-11-06|fre|10:15|DodLabb  |C1.04|Mars    |ALW       
Dod |2026-11-06|fre|10:15|DodLabb  |C1.05|Saturnus|WIS       
Dod |2026-11-06|fre|10:15|DodLabb  |C1.06|Venus   |ALL       
Prog|2026-11-06|fre|13:15|ProgLabb |D1.08|Alfa    |SAJ       
Prog|2026-11-06|fre|13:15|ProgLabb |D1.09|Beta    |ALS       
Prog|2026-11-06|fre|13:15|ProgLabb |D1.10|Falk    |FEA       
Prog|2026-11-06|fre|13:15|ProgLabb |D1.11|Gamma   |AXE       
Prog|2026-11-06|fre|13:15|ProgLabb |D1.12|Hacke   |ANM       
Prog|2026-11-06|fre|13:15|ProgLabb |D1.13|Val     |VAB       
Prog|2026-11-06|fre|13:15|ProgLabb |D1.14|Varg    |WIS       
Prog|2026-11-06|fre|13:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-11-06|fre|13:15|ProgLabb |XA2  |Ambulans|ERW       
Dod |2026-11-06|fre|13:15|DodLabb  |C1.01|Elgkalv |ARH       
Dod |2026-11-06|fre|13:15|DodLabb  |C1.02|Panter  |ERE       
Dod |2026-11-06|fre|13:15|DodLabb  |C1.03|Ravel   |ALA       
Prog|2026-11-06|fre|15:15|ProgLabb |C1.01|Alfa    |LIL       
Prog|2026-11-06|fre|15:15|ProgLabb |C1.02|Beta    |ERE       
Prog|2026-11-06|fre|15:15|ProgLabb |C1.03|Falk    |EDJ       
Prog|2026-11-06|fre|15:15|ProgLabb |C1.04|Gamma   |ALW       
Prog|2026-11-06|fre|15:15|ProgLabb |C1.05|Val     |ANP       
Prog|2026-11-06|fre|15:15|ProgLabb |C1.06|Varg    |ALL       
Prog|2026-11-06|fre|15:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-11-06|fre|15:15|ProgLabb |XA2  |Ambulans|ERW       
Dod |2026-11-06|fre|15:15|DodLabb  |D1.12|Jupiter |ANM       
Dod |2026-11-06|fre|15:15|DodLabb  |D1.13|Mars    |VIB       
Dod |2026-11-06|fre|15:15|DodLabb  |D1.14|Saturnus|WIS       
Prog|2026-11-11|ons|13:15|Resurstid|D1.01|Falk    |JUA       
Prog|2026-11-11|ons|13:15|Resurstid|D1.02|Ravel   |SOG       
Prog|2026-11-11|ons|13:15|Resurstid|D1.03|Val     |AXF       
Prog|2026-11-11|ons|13:15|Resurstid|D1.04|Varg    |VIB       
Prog|2026-11-11|ons|13:15|Resurstid|D1.05|Elg     |AXE       
Prog|2026-11-11|ons|13:15|Resurstid|D1.06|Elgkalv |MAF       
Prog|2026-11-11|ons|13:15|Resurstid|D1.07|Hacke   |ARH       
Prog|2026-11-11|ons|13:15|Resurstid|D1.08|Panter  |SAJ       
Prog|2026-11-11|ons|13:15|Resurstid|D1.09|Alfa    |ALS       
Prog|2026-11-11|ons|13:15|Resurstid|D1.10|Beta    |MAK       
Prog|2026-11-11|ons|13:15|Resurstid|D1.11|Gamma   |DAA       
Dod |2026-11-12|tor|08:15|DodLabb  |D1.08|Hacke   |SAJ       
Dod |2026-11-12|tor|08:15|DodLabb  |D1.09|Panter  |ALS       
Dod |2026-11-12|tor|08:15|DodLabb  |D1.10|Ravel   |ANP       
Dod |2026-11-12|tor|08:15|DodLabb  |D1.11|Val     |DAA       
Prog|2026-11-12|tor|13:15|Resurstid|C1.01|Falk    |ALA       
Prog|2026-11-12|tor|13:15|Resurstid|C1.02|Hacke   |ERE       
Prog|2026-11-12|tor|13:15|Resurstid|C1.03|Panter  |EDJ       
Prog|2026-11-12|tor|13:15|Resurstid|C1.04|Ravel   |ALW       
Prog|2026-11-12|tor|13:15|Resurstid|C1.05|Val     |ANP       
Prog|2026-11-12|tor|13:15|Resurstid|C1.06|Varg    |ALL       
Prog|2026-11-12|tor|13:15|Resurstid|D1.12|Alfa    |ANM       
Prog|2026-11-12|tor|13:15|Resurstid|D1.13|Beta    |VAB       
Prog|2026-11-12|tor|13:15|Resurstid|D1.14|Gamma   |WIS       
Dod |2026-11-13|fre|08:15|DodLabb  |D1.01|Jupiter |JUA       
Dod |2026-11-13|fre|08:15|DodLabb  |D1.02|Mars    |SOG       
Dod |2026-11-13|fre|08:15|DodLabb  |D1.03|Saturnus|ALL       
Dod |2026-11-13|fre|08:15|DodLabb  |D1.04|Venus   |LIL       
Dod |2026-11-13|fre|08:15|DodLabb  |D1.05|Falk    |AXE       
Dod |2026-11-13|fre|08:15|DodLabb  |D1.06|Val     |MAC       
Dod |2026-11-13|fre|08:15|DodLabb  |D1.07|Varg    |ALA       
Prog|2026-11-13|fre|10:15|ProgLabb |D1.01|Alfa    |JUA       
Prog|2026-11-13|fre|10:15|ProgLabb |D1.02|Beta    |SOG       
Prog|2026-11-13|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-11-13|fre|10:15|ProgLabb |D1.04|Gamma   |VIB       
Prog|2026-11-13|fre|10:15|ProgLabb |D1.05|Ravel   |AXE       
Prog|2026-11-13|fre|10:15|ProgLabb |D1.06|Val     |FEA       
Prog|2026-11-13|fre|10:15|ProgLabb |D1.07|Varg    |EMM       
Prog|2026-11-13|fre|10:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-11-13|fre|10:15|ProgLabb |XA2  |Ambulans|ARH       
Dod |2026-11-13|fre|10:15|DodLabb  |C1.04|Mars    |ALW       
Dod |2026-11-13|fre|10:15|DodLabb  |C1.05|Saturnus|ALS       
Dod |2026-11-13|fre|10:15|DodLabb  |C1.06|Venus   |ALL       
Prog|2026-11-13|fre|13:15|ProgLabb |D1.08|Alfa    |SAJ       
Prog|2026-11-13|fre|13:15|ProgLabb |D1.09|Beta    |ALS       
Prog|2026-11-13|fre|13:15|ProgLabb |D1.10|Falk    |ALA       
Prog|2026-11-13|fre|13:15|ProgLabb |D1.11|Gamma   |DAA       
Prog|2026-11-13|fre|13:15|ProgLabb |D1.12|Hacke   |ANM       
Prog|2026-11-13|fre|13:15|ProgLabb |D1.13|Val     |VAB       
Prog|2026-11-13|fre|13:15|ProgLabb |D1.14|Varg    |WIS       
Prog|2026-11-13|fre|13:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-11-13|fre|13:15|ProgLabb |XA2  |Ambulans|ERW       
Dod |2026-11-13|fre|13:15|DodLabb  |C1.01|Elgkalv |AXE       
Dod |2026-11-13|fre|13:15|DodLabb  |C1.02|Panter  |ERE       
Dod |2026-11-13|fre|13:15|DodLabb  |C1.03|Ravel   |JUA       
Prog|2026-11-13|fre|15:15|ProgLabb |C1.01|Alfa    |LIL       
Prog|2026-11-13|fre|15:15|ProgLabb |C1.02|Beta    |ERE       
Prog|2026-11-13|fre|15:15|ProgLabb |C1.03|Falk    |EDJ       
Prog|2026-11-13|fre|15:15|ProgLabb |C1.04|Gamma   |ALW       
Prog|2026-11-13|fre|15:15|ProgLabb |C1.05|Val     |ANP       
Prog|2026-11-13|fre|15:15|ProgLabb |C1.06|Varg    |ALL       
Prog|2026-11-13|fre|15:15|ProgLabb |XA1  |Ambulans|MAC       
Prog|2026-11-13|fre|15:15|ProgLabb |XA2  |Ambulans|ERW       
Dod |2026-11-13|fre|15:15|DodLabb  |D1.12|Jupiter |ANM       
Dod |2026-11-13|fre|15:15|DodLabb  |D1.13|Mars    |ARH       
Dod |2026-11-13|fre|15:15|DodLabb  |D1.14|Saturnus|WIS       
Prog|2026-11-18|ons|13:15|Resurstid|D1.01|Falk    |JUA       
Prog|2026-11-18|ons|13:15|Resurstid|D1.02|Ravel   |ERE       
Prog|2026-11-18|ons|13:15|Resurstid|D1.03|Val     |ERW       
Prog|2026-11-18|ons|13:15|Resurstid|D1.04|Varg    |VIB       
Prog|2026-11-18|ons|13:15|Resurstid|D1.05|Elg     |WIS       
Prog|2026-11-18|ons|13:15|Resurstid|D1.06|Elgkalv |MAF       
Prog|2026-11-18|ons|13:15|Resurstid|D1.07|Hacke   |ANP       
Prog|2026-11-18|ons|13:15|Resurstid|D1.08|Panter  |SAJ       
Prog|2026-11-18|ons|13:15|Resurstid|D1.09|Alfa    |ALS       
Prog|2026-11-18|ons|13:15|Resurstid|D1.10|Beta    |MAK       
Prog|2026-11-18|ons|13:15|Resurstid|D1.11|Gamma   |DAA       
Prog|2026-11-19|tor|13:15|Resurstid|C1.01|Falk    |LIL       
Prog|2026-11-19|tor|13:15|Resurstid|C1.02|Hacke   |ERW       
Prog|2026-11-19|tor|13:15|Resurstid|C1.03|Panter  |EDJ       
Prog|2026-11-19|tor|13:15|Resurstid|C1.04|Ravel   |ALW       
Prog|2026-11-19|tor|13:15|Resurstid|C1.05|Val     |ANP       
Prog|2026-11-19|tor|13:15|Resurstid|C1.06|Varg    |ALL       
Prog|2026-11-19|tor|13:15|Resurstid|D1.12|Alfa    |ANM       
Prog|2026-11-19|tor|13:15|Resurstid|D1.13|Beta    |VAB       
Prog|2026-11-19|tor|13:15|Resurstid|D1.14|Gamma   |WIS       
Prog|2026-11-20|fre|10:15|ProgLabb |D1.01|Alfa    |JUA       
Prog|2026-11-20|fre|10:15|ProgLabb |D1.02|Beta    |SOG       
Prog|2026-11-20|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-11-20|fre|10:15|ProgLabb |D1.04|Gamma   |VIB       
Prog|2026-11-20|fre|10:15|ProgLabb |D1.05|Ravel   |ARH       
Prog|2026-11-20|fre|10:15|ProgLabb |D1.06|Val     |ERE       
Prog|2026-11-20|fre|10:15|ProgLabb |D1.07|Varg    |EMM       
Prog|2026-11-20|fre|10:15|ProgLabb |XA1  |Ambulans|ANM       
Prog|2026-11-20|fre|10:15|ProgLabb |XA2  |Ambulans|WIS       
Prog|2026-11-20|fre|10:15|ProgLabb |XA3  |Ambulans|VAB       
Prog|2026-11-20|fre|13:15|ProgLabb |D1.08|Alfa    |SAJ       
Prog|2026-11-20|fre|13:15|ProgLabb |D1.09|Beta    |ALS       
Prog|2026-11-20|fre|13:15|ProgLabb |D1.10|Falk    |ALA       
Prog|2026-11-20|fre|13:15|ProgLabb |D1.11|Gamma   |DAA       
Prog|2026-11-20|fre|13:15|ProgLabb |D1.12|Hacke   |ANM       
Prog|2026-11-20|fre|13:15|ProgLabb |D1.13|Val     |VAB       
Prog|2026-11-20|fre|13:15|ProgLabb |D1.14|Varg    |WIS       
Prog|2026-11-20|fre|13:15|ProgLabb |XA1  |Ambulans|JUA       
Prog|2026-11-20|fre|13:15|ProgLabb |XA2  |Ambulans|SOG       
Prog|2026-11-20|fre|13:15|ProgLabb |XA3  |Ambulans|ERW       
Prog|2026-11-20|fre|15:15|ProgLabb |C1.01|Alfa    |LIL       
Prog|2026-11-20|fre|15:15|ProgLabb |C1.02|Beta    |ERE       
Prog|2026-11-20|fre|15:15|ProgLabb |C1.03|Falk    |EDJ       
Prog|2026-11-20|fre|15:15|ProgLabb |C1.04|Gamma   |ALW       
Prog|2026-11-20|fre|15:15|ProgLabb |C1.05|Val     |ANP       
Prog|2026-11-20|fre|15:15|ProgLabb |C1.06|Varg    |ALL       
Prog|2026-11-20|fre|15:15|ProgLabb |XA1  |Ambulans|ARH       
Prog|2026-11-20|fre|15:15|ProgLabb |XA2  |Ambulans|DAA       
Prog|2026-11-20|fre|15:15|ProgLabb |XA3  |Ambulans|ERW       
Prog|2026-11-25|ons|13:15|Resurstid|D1.01|Falk    |JUA       
Prog|2026-11-25|ons|13:15|Resurstid|D1.02|Ravel   |ARH       
Prog|2026-11-25|ons|13:15|Resurstid|D1.03|Val     |AXF       
Prog|2026-11-25|ons|13:15|Resurstid|D1.04|Varg    |VIB       
Prog|2026-11-25|ons|13:15|Resurstid|D1.05|Elg     |AXE       
Prog|2026-11-25|ons|13:15|Resurstid|D1.06|Elgkalv |MAF       
Prog|2026-11-25|ons|13:15|Resurstid|D1.07|Hacke   |ANP       
Prog|2026-11-25|ons|13:15|Resurstid|D1.08|Panter  |SAJ       
Prog|2026-11-25|ons|13:15|Resurstid|D1.09|Alfa    |ALS       
Prog|2026-11-25|ons|13:15|Resurstid|D1.10|Beta    |MAK       
Prog|2026-11-25|ons|13:15|Resurstid|D1.11|Gamma   |DAA       
Prog|2026-11-26|tor|13:15|Resurstid|C1.01|Falk    |MAC       
Prog|2026-11-26|tor|13:15|Resurstid|C1.02|Hacke   |ERE       
Prog|2026-11-26|tor|13:15|Resurstid|C1.03|Panter  |EDJ       
Prog|2026-11-26|tor|13:15|Resurstid|C1.04|Ravel   |ALW       
Prog|2026-11-26|tor|13:15|Resurstid|C1.05|Val     |ANP       
Prog|2026-11-26|tor|13:15|Resurstid|C1.06|Varg    |ALL       
Prog|2026-11-26|tor|13:15|Resurstid|D1.12|Alfa    |ANM       
Prog|2026-11-26|tor|13:15|Resurstid|D1.13|Beta    |VAB       
Prog|2026-11-26|tor|13:15|Resurstid|D1.14|Gamma   |WIS       
Prog|2026-11-27|fre|10:15|ProgLabb |D1.01|Alfa    |JUA       
Prog|2026-11-27|fre|10:15|ProgLabb |D1.02|Beta    |VAB       
Prog|2026-11-27|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-11-27|fre|10:15|ProgLabb |D1.04|Gamma   |VIB       
Prog|2026-11-27|fre|10:15|ProgLabb |D1.05|Ravel   |ANM       
Prog|2026-11-27|fre|10:15|ProgLabb |D1.06|Val     |ALW       
Prog|2026-11-27|fre|10:15|ProgLabb |D1.07|Varg    |WIS       
Prog|2026-11-27|fre|10:15|ProgLabb |XA1  |Ambulans|ALL       
Prog|2026-11-27|fre|13:15|ProgLabb |D1.08|Alfa    |SAJ       
Prog|2026-11-27|fre|13:15|ProgLabb |D1.09|Beta    |ALS       
Prog|2026-11-27|fre|13:15|ProgLabb |D1.10|Falk    |ALA       
Prog|2026-11-27|fre|13:15|ProgLabb |D1.11|Gamma   |DAA       
Prog|2026-11-27|fre|13:15|ProgLabb |D1.12|Hacke   |ANM       
Prog|2026-11-27|fre|13:15|ProgLabb |D1.13|Val     |VAB       
Prog|2026-11-27|fre|13:15|ProgLabb |D1.14|Varg    |WIS       
Prog|2026-11-27|fre|13:15|ProgLabb |XA1  |Ambulans|AXE       
Prog|2026-11-27|fre|13:15|ProgLabb |XA2  |Ambulans|SOG       
Prog|2026-11-27|fre|13:15|ProgLabb |XA3  |Ambulans|ERW       
Prog|2026-11-27|fre|15:15|ProgLabb |C1.01|Alfa    |LIL       
Prog|2026-11-27|fre|15:15|ProgLabb |C1.02|Beta    |ERE       
Prog|2026-11-27|fre|15:15|ProgLabb |C1.03|Falk    |EDJ       
Prog|2026-11-27|fre|15:15|ProgLabb |C1.04|Gamma   |ALW       
Prog|2026-11-27|fre|15:15|ProgLabb |C1.05|Val     |ANP       
Prog|2026-11-27|fre|15:15|ProgLabb |C1.06|Varg    |ALL       
Prog|2026-11-27|fre|15:15|ProgLabb |XA1  |Ambulans|ARH       
Prog|2026-11-27|fre|15:15|ProgLabb |XA2  |Ambulans|EMM       
Prog|2026-11-27|fre|15:15|ProgLabb |XA3  |Ambulans|ERW       
Prog|2026-12-02|ons|13:15|Resurstid|D1.01|Falk    |JUA       
Prog|2026-12-02|ons|13:15|Resurstid|D1.02|Ravel   |EDJ       
Prog|2026-12-02|ons|13:15|Resurstid|D1.03|Val     |AXF       
Prog|2026-12-02|ons|13:15|Resurstid|D1.04|Varg    |VIB       
Prog|2026-12-02|ons|13:15|Resurstid|D1.05|Elg     |AXE       
Prog|2026-12-02|ons|13:15|Resurstid|D1.06|Elgkalv |MAF       
Prog|2026-12-02|ons|13:15|Resurstid|D1.07|Hacke   |WIS       
Prog|2026-12-02|ons|13:15|Resurstid|D1.08|Panter  |SAJ       
Prog|2026-12-02|ons|13:15|Resurstid|D1.09|Alfa    |ALS       
Prog|2026-12-02|ons|13:15|Resurstid|D1.10|Beta    |MAK       
Prog|2026-12-02|ons|13:15|Resurstid|D1.11|Gamma   |DAA       
Prog|2026-12-03|tor|13:15|Resurstid|C1.01|Falk    |LIL       
Prog|2026-12-03|tor|13:15|Resurstid|C1.02|Hacke   |ALA       
Prog|2026-12-03|tor|13:15|Resurstid|C1.03|Panter  |EDJ       
Prog|2026-12-03|tor|13:15|Resurstid|C1.04|Ravel   |ALW       
Prog|2026-12-03|tor|13:15|Resurstid|C1.05|Val     |ANP       
Prog|2026-12-03|tor|13:15|Resurstid|C1.06|Varg    |ALL       
Prog|2026-12-03|tor|13:15|Resurstid|D1.12|Alfa    |ANM       
Prog|2026-12-03|tor|13:15|Resurstid|D1.13|Beta    |VAB       
Prog|2026-12-03|tor|13:15|Resurstid|D1.14|Gamma   |WIS       
Prog|2026-12-04|fre|10:15|ProgLabb |D1.01|Alfa    |JUA       
Prog|2026-12-04|fre|10:15|ProgLabb |D1.02|Beta    |SOG       
Prog|2026-12-04|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-12-04|fre|10:15|ProgLabb |D1.04|Gamma   |VIB       
Prog|2026-12-04|fre|10:15|ProgLabb |D1.05|Ravel   |AXE       
Prog|2026-12-04|fre|10:15|ProgLabb |D1.06|Val     |ANM       
Prog|2026-12-04|fre|10:15|ProgLabb |D1.07|Varg    |ERE       
Prog|2026-12-04|fre|10:15|ProgLabb |XA1  |Ambulans|WIS       
Prog|2026-12-04|fre|10:15|ProgLabb |XA2  |Ambulans|ALW       
Prog|2026-12-04|fre|10:15|ProgLabb |XA3  |Ambulans|ALL       
Prog|2026-12-04|fre|13:15|ProgLabb |D1.08|Alfa    |SAJ       
Prog|2026-12-04|fre|13:15|ProgLabb |D1.09|Beta    |ALS       
Prog|2026-12-04|fre|13:15|ProgLabb |D1.10|Falk    |ALA       
Prog|2026-12-04|fre|13:15|ProgLabb |D1.11|Gamma   |DAA       
Prog|2026-12-04|fre|13:15|ProgLabb |D1.12|Hacke   |ANM       
Prog|2026-12-04|fre|13:15|ProgLabb |D1.13|Val     |VAB       
Prog|2026-12-04|fre|13:15|ProgLabb |D1.14|Varg    |WIS       
Prog|2026-12-04|fre|13:15|ProgLabb |XA1  |Ambulans|SOG       
Prog|2026-12-04|fre|13:15|ProgLabb |XA2  |Ambulans|ERE       
Prog|2026-12-04|fre|13:15|ProgLabb |XA3  |Ambulans|AXF       
Prog|2026-12-04|fre|15:15|ProgLabb |C1.01|Alfa    |LIL       
Prog|2026-12-04|fre|15:15|ProgLabb |C1.02|Beta    |ERE       
Prog|2026-12-04|fre|15:15|ProgLabb |C1.03|Falk    |EDJ       
Prog|2026-12-04|fre|15:15|ProgLabb |C1.04|Gamma   |ALW       
Prog|2026-12-04|fre|15:15|ProgLabb |C1.05|Val     |ANP       
Prog|2026-12-04|fre|15:15|ProgLabb |C1.06|Varg    |ALL       
Prog|2026-12-04|fre|15:15|ProgLabb |XA1  |Ambulans|ARH       
Prog|2026-12-04|fre|15:15|ProgLabb |XA2  |Ambulans|EMM       
Prog|2026-12-04|fre|15:15|ProgLabb |XA3  |Ambulans|AXF       
Prog|2026-12-09|ons|13:15|Resurstid|D1.01|Falk    |JUA       
Prog|2026-12-09|ons|13:15|Resurstid|D1.02|Ravel   |EDJ       
Prog|2026-12-09|ons|13:15|Resurstid|D1.03|Val     |AXF       
Prog|2026-12-09|ons|13:15|Resurstid|D1.04|Varg    |VIB       
Prog|2026-12-09|ons|13:15|Resurstid|D1.05|Elg     |AXE       
Prog|2026-12-09|ons|13:15|Resurstid|D1.06|Elgkalv |MAF       
Prog|2026-12-09|ons|13:15|Resurstid|D1.07|Hacke   |ZZZ       
Prog|2026-12-09|ons|13:15|Resurstid|D1.08|Panter  |SAJ       
Prog|2026-12-09|ons|13:15|Resurstid|D1.09|Alfa    |ALS       
Prog|2026-12-09|ons|13:15|Resurstid|D1.10|Beta    |MAK       
Prog|2026-12-09|ons|13:15|Resurstid|D1.11|Gamma   |DAA       
Prog|2026-12-10|tor|13:15|Resurstid|C1.01|Falk    |MAC       
Prog|2026-12-10|tor|13:15|Resurstid|C1.02|Hacke   |ERE       
Prog|2026-12-10|tor|13:15|Resurstid|C1.03|Panter  |EDJ       
Prog|2026-12-10|tor|13:15|Resurstid|C1.04|Ravel   |ALW       
Prog|2026-12-10|tor|13:15|Resurstid|C1.05|Val     |ANP       
Prog|2026-12-10|tor|13:15|Resurstid|C1.06|Varg    |ALL       
Prog|2026-12-10|tor|13:15|Resurstid|D1.12|Alfa    |ANM       
Prog|2026-12-10|tor|13:15|Resurstid|D1.13|Beta    |VAB       
Prog|2026-12-10|tor|13:15|Resurstid|D1.14|Gamma   |WIS       
Prog|2026-12-11|fre|10:15|ProgLabb |D1.01|Alfa    |JUA       
Prog|2026-12-11|fre|10:15|ProgLabb |D1.02|Beta    |WIS       
Prog|2026-12-11|fre|10:15|ProgLabb |D1.03|Falk    |AXF       
Prog|2026-12-11|fre|10:15|ProgLabb |D1.04|Gamma   |VIB       
Prog|2026-12-11|fre|10:15|ProgLabb |D1.05|Ravel   |AXE       
Prog|2026-12-11|fre|10:15|ProgLabb |D1.06|Val     |VAB       
Prog|2026-12-11|fre|10:15|ProgLabb |D1.07|Varg    |ANM       
Prog|2026-12-11|fre|10:15|ProgLabb |XA1  |Ambulans|ALW       
Prog|2026-12-11|fre|10:15|ProgLabb |XA2  |Ambulans|ALL       
Prog|2026-12-11|fre|13:15|ProgLabb |D1.08|Alfa    |SAJ       
Prog|2026-12-11|fre|13:15|ProgLabb |D1.09|Beta    |ALS       
Prog|2026-12-11|fre|13:15|ProgLabb |D1.10|Falk    |ARH       
Prog|2026-12-11|fre|13:15|ProgLabb |D1.11|Gamma   |DAA       
Prog|2026-12-11|fre|13:15|ProgLabb |D1.12|Hacke   |ANM       
Prog|2026-12-11|fre|13:15|ProgLabb |D1.13|Val     |VAB       
Prog|2026-12-11|fre|13:15|ProgLabb |D1.14|Varg    |WIS       
Prog|2026-12-11|fre|13:15|ProgLabb |XA1  |Ambulans|ALA       
Prog|2026-12-11|fre|13:15|ProgLabb |XA2  |Ambulans|SOG       
Prog|2026-12-11|fre|13:15|ProgLabb |XA3  |Ambulans|ERE       
Prog|2026-12-11|fre|15:15|ProgLabb |C1.01|Alfa    |LIL       
Prog|2026-12-11|fre|15:15|ProgLabb |C1.02|Beta    |ERE       
Prog|2026-12-11|fre|15:15|ProgLabb |C1.03|Falk    |EDJ       
Prog|2026-12-11|fre|15:15|ProgLabb |C1.04|Gamma   |ALW       
Prog|2026-12-11|fre|15:15|ProgLabb |C1.05|Val     |ANP       
Prog|2026-12-11|fre|15:15|ProgLabb |C1.06|Varg    |ALL       
Prog|2026-12-11|fre|15:15|ProgLabb |XA1  |Ambulans|EMM       
Prog|2026-12-11|fre|15:15|ProgLabb |XA2  |Ambulans|ALA       
Prog|2026-12-11|fre|15:15|ProgLabb |XA3  |Ambulans|SOG       
Prog|2026-12-16|ons|13:15|Resurstid|D1.01|Falk    |JUA       
Prog|2026-12-16|ons|13:15|Resurstid|D1.02|Ravel   |SOG       
Prog|2026-12-16|ons|13:15|Resurstid|D1.03|Val     |AXF       
Prog|2026-12-16|ons|13:15|Resurstid|D1.04|Varg    |VIB       
Prog|2026-12-16|ons|13:15|Resurstid|D1.05|Elg     |AXE       
Prog|2026-12-16|ons|13:15|Resurstid|D1.06|Elgkalv |WIS       
Prog|2026-12-16|ons|13:15|Resurstid|D1.07|Hacke   |ALA       
Prog|2026-12-16|ons|13:15|Resurstid|D1.08|Panter  |SAJ       
Prog|2026-12-16|ons|13:15|Resurstid|D1.09|Alfa    |ALS       
Prog|2026-12-16|ons|13:15|Resurstid|D1.10|Beta    |MAC       
Prog|2026-12-16|ons|13:15|Resurstid|D1.11|Gamma   |DAA       
Prog|2026-12-17|tor|13:15|Resurstid|C1.01|Falk    |LIL       
Prog|2026-12-17|tor|13:15|Resurstid|C1.02|Hacke   |JUA       
Prog|2026-12-17|tor|13:15|Resurstid|C1.03|Panter  |ALA       
Prog|2026-12-17|tor|13:15|Resurstid|C1.04|Ravel   |AXF       
Prog|2026-12-17|tor|13:15|Resurstid|C1.05|Val     |ANP       
Prog|2026-12-17|tor|13:15|Resurstid|C1.06|Varg    |ALL       
Prog|2026-12-17|tor|13:15|Resurstid|D1.12|Alfa    |ANM       
Prog|2026-12-17|tor|13:15|Resurstid|D1.13|Beta    |VAB       
Prog|2026-12-17|tor|13:15|Resurstid|D1.14|Gamma   |WIS       
""".trim.split('\n').toSeq