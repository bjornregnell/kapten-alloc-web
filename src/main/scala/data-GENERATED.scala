package kaptenallocweb
val dataGeneratedFromKaptenAlloc: Seq[String] = """
--------------------------------------------------------------
del |datum     |dag|kl   |typ      |grupp|rum      |handledare
--------------------------------------------------------------
Prog|2025-09-03|ons|15:15|Resurstid|D1.01|Alfa     |SAR       
Prog|2025-09-03|ons|15:15|Resurstid|D1.02|Beta     |SAJ       
Prog|2025-09-03|ons|15:15|Resurstid|D1.03|Gamma    |ALW       
Prog|2025-09-03|ons|15:15|Resurstid|D1.04|Elg      |JUG       
Prog|2025-09-03|ons|15:15|Resurstid|D1.09|Hacke    |ELÅ       
Prog|2025-09-03|ons|15:15|Resurstid|D1.10|Panter   |NAK       
Prog|2025-09-03|ons|15:15|Resurstid|D1.11|Ravel    |WIS       
Prog|2025-09-03|ons|15:15|Resurstid|D1.12|Falk     |MAU       
Prog|2025-09-03|ons|15:15|Resurstid|D1.13|Val      |MOJ       
Prog|2025-09-03|ons|15:15|Resurstid|D1.14|Varg     |AXF       
Prog|2025-09-03|ons|15:15|Resurstid|XA1  |Ambulans |MEW       
Dod |2025-09-04|tor|10:15|DodLabb  |C1.01|Alfa     |JOE       
Dod |2025-09-04|tor|10:15|DodLabb  |C1.02|Beta     |APR       
Dod |2025-09-04|tor|10:15|DodLabb  |C1.03|Gamma    |JON       
Dod |2025-09-04|tor|10:15|DodLabb  |D1.05|Elg      |AXF       
Dod |2025-09-04|tor|10:15|DodLabb  |D1.06|Hacke    |MOJ       
Dod |2025-09-04|tor|10:15|DodLabb  |D1.07|Panter   |VIB       
Dod |2025-09-04|tor|10:15|DodLabb  |D1.08|Ravel    |LOL       
Dod |2025-09-04|tor|10:15|DodLabb  |D1.09|Falk     |ELÅ       
Dod |2025-09-04|tor|10:15|DodLabb  |D1.11|Val      |WIS       
Prog|2025-09-04|tor|13:15|Resurstid|D1.05|Alfa     |MOG       
Prog|2025-09-04|tor|13:15|Resurstid|D1.06|Beta     |EBF       
Prog|2025-09-04|tor|13:15|Resurstid|D1.07|Elg      |VIB       
Prog|2025-09-04|tor|13:15|Resurstid|D1.08|Gamma    |LOL       
Dod |2025-09-04|tor|13:15|DodLabb  |D1.01|Elgkalv  |SAR       
Dod |2025-09-04|tor|13:15|DodLabb  |D1.02|Hacke    |APR       
Dod |2025-09-04|tor|13:15|DodLabb  |D1.03|Panter   |MAU       
Dod |2025-09-04|tor|13:15|DodLabb  |D1.04|Ravel    |JUG       
Prog|2025-09-04|tor|15:15|Resurstid|C1.01|Falk     |ALL       
Prog|2025-09-04|tor|15:15|Resurstid|C1.02|Val      |ASH       
Prog|2025-09-04|tor|15:15|Resurstid|C1.03|Varg     |JON       
Prog|2025-09-04|tor|15:15|Resurstid|C1.04|Hacke    |APR       
Prog|2025-09-04|tor|15:15|Resurstid|C1.05|Panter   |JOE       
Prog|2025-09-04|tor|15:15|Resurstid|C1.06|Ravel    |KAS       
Prog|2025-09-04|tor|15:15|Resurstid|XA1  |Ambulans |MEW       
Prog|2025-09-05|fre|10:15|ProgLabb |D1.01|Alfa     |SAR       
Prog|2025-09-05|fre|10:15|ProgLabb |D1.02|Beta     |SAJ       
Prog|2025-09-05|fre|10:15|ProgLabb |D1.03|Falk     |APR       
Prog|2025-09-05|fre|10:15|ProgLabb |D1.04|Gamma    |JUG       
Prog|2025-09-05|fre|10:15|ProgLabb |D1.05|Hacke    |MOG       
Prog|2025-09-05|fre|10:15|ProgLabb |D1.06|Val      |NAK       
Prog|2025-09-05|fre|10:15|ProgLabb |D1.07|Varg     |VIB       
Prog|2025-09-05|fre|10:15|ProgLabb |XA1  |Ambulans1|WIS       
Prog|2025-09-05|fre|10:15|ProgLabb |XA2  |Ambulans2|ELÅ       
Prog|2025-09-05|fre|10:15|ProgLabb |XA3  |Ambulans3|KAS       
Prog|2025-09-05|fre|10:15|ProgLabb |XA4  |Ambulans4|JON       
Dod |2025-09-05|fre|10:15|DodLabb  |D1.12|Elgkalv  |JOE       
Dod |2025-09-05|fre|10:15|DodLabb  |D1.13|Panter   |MOJ       
Dod |2025-09-05|fre|10:15|DodLabb  |D1.14|Ravel    |AXF       
Prog|2025-09-05|fre|13:15|ProgLabb |D1.08|Alfa     |LOL       
Prog|2025-09-05|fre|13:15|ProgLabb |D1.09|Beta     |ELÅ       
Prog|2025-09-05|fre|13:15|ProgLabb |D1.10|Falk     |NAK       
Prog|2025-09-05|fre|13:15|ProgLabb |D1.11|Gamma    |WIS       
Prog|2025-09-05|fre|13:15|ProgLabb |D1.12|Hacke    |MAU       
Prog|2025-09-05|fre|13:15|ProgLabb |D1.13|Val      |MOJ       
Prog|2025-09-05|fre|13:15|ProgLabb |D1.14|Varg     |AXF       
Prog|2025-09-05|fre|13:15|ProgLabb |XA1  |Ambulans1|ALL       
Prog|2025-09-05|fre|13:15|ProgLabb |XA2  |Ambulans2|EBF       
Prog|2025-09-05|fre|13:15|ProgLabb |XA3  |Ambulans3|LIL       
Prog|2025-09-05|fre|13:15|ProgLabb |XA4  |Ambulans4|MEW       
Dod |2025-09-05|fre|13:15|DodLabb  |C1.04|Elgkalv  |APR       
Dod |2025-09-05|fre|13:15|DodLabb  |C1.05|Panter   |ALW       
Dod |2025-09-05|fre|13:15|DodLabb  |C1.06|Ravel    |MOG       
Prog|2025-09-05|fre|15:15|ProgLabb |C1.01|Alfa     |HAE       
Prog|2025-09-05|fre|15:15|ProgLabb |C1.02|Beta     |ASH       
Prog|2025-09-05|fre|15:15|ProgLabb |C1.03|Falk     |JON       
Prog|2025-09-05|fre|15:15|ProgLabb |C1.04|Gamma    |APR       
Prog|2025-09-05|fre|15:15|ProgLabb |C1.05|Val      |JOE       
Prog|2025-09-05|fre|15:15|ProgLabb |C1.06|Varg     |KAS       
Prog|2025-09-05|fre|15:15|ProgLabb |XA1  |Ambulans1|ALL       
Prog|2025-09-05|fre|15:15|ProgLabb |XA2  |Ambulans2|EBF       
Prog|2025-09-05|fre|15:15|ProgLabb |XA3  |Ambulans3|LIL       
Prog|2025-09-05|fre|15:15|ProgLabb |XA4  |Ambulans4|MEW       
Prog|2025-09-10|ons|15:15|Resurstid|D1.01|Alfa     |SAR       
Prog|2025-09-10|ons|15:15|Resurstid|D1.02|Beta     |SAJ       
Prog|2025-09-10|ons|15:15|Resurstid|D1.03|Gamma    |ALW       
Prog|2025-09-10|ons|15:15|Resurstid|D1.04|Elg      |JUG       
Prog|2025-09-10|ons|15:15|Resurstid|D1.09|Hacke    |ELÅ       
Prog|2025-09-10|ons|15:15|Resurstid|D1.10|Panter   |NAK       
Prog|2025-09-10|ons|15:15|Resurstid|D1.11|Ravel    |WIS       
Prog|2025-09-10|ons|15:15|Resurstid|D1.12|Falk     |MAU       
Prog|2025-09-10|ons|15:15|Resurstid|D1.13|Val      |MOJ       
Prog|2025-09-10|ons|15:15|Resurstid|D1.14|Varg     |AXF       
Prog|2025-09-10|ons|15:15|Resurstid|XA1  |Ambulans |MEW       
Dod |2025-09-11|tor|10:15|DodLabb  |C1.01|Alfa     |ELÅ       
Dod |2025-09-11|tor|10:15|DodLabb  |C1.02|Beta     |LOL       
Dod |2025-09-11|tor|10:15|DodLabb  |C1.03|Gamma    |APR       
Dod |2025-09-11|tor|10:15|DodLabb  |D1.05|Elg      |LIL       
Dod |2025-09-11|tor|10:15|DodLabb  |D1.06|Hacke    |AXF       
Dod |2025-09-11|tor|10:15|DodLabb  |D1.07|Panter   |WIS       
Dod |2025-09-11|tor|10:15|DodLabb  |D1.08|Ravel    |VIB       
Dod |2025-09-11|tor|10:15|DodLabb  |D1.09|Falk     |JON       
Dod |2025-09-11|tor|10:15|DodLabb  |D1.10|Val      |MOJ       
Dod |2025-09-11|tor|10:15|DodLabb  |D1.11|Varg     |KAS       
Prog|2025-09-11|tor|13:15|Resurstid|D1.05|Alfa     |MOG       
Prog|2025-09-11|tor|13:15|Resurstid|D1.06|Beta     |HAE       
Prog|2025-09-11|tor|13:15|Resurstid|D1.07|Elg      |VIB       
Prog|2025-09-11|tor|13:15|Resurstid|D1.08|Gamma    |LOL       
Dod |2025-09-11|tor|13:15|DodLabb  |D1.01|Elgkalv  |ELÅ       
Dod |2025-09-11|tor|13:15|DodLabb  |D1.02|Hacke    |NAK       
Dod |2025-09-11|tor|13:15|DodLabb  |D1.03|Panter   |APR       
Dod |2025-09-11|tor|13:15|DodLabb  |D1.04|Ravel    |WIS       
Prog|2025-09-11|tor|15:15|Resurstid|C1.01|Falk     |EBF       
Prog|2025-09-11|tor|15:15|Resurstid|C1.02|Val      |NAK       
Prog|2025-09-11|tor|15:15|Resurstid|C1.03|Varg     |JON       
Prog|2025-09-11|tor|15:15|Resurstid|C1.04|Hacke    |APR       
Prog|2025-09-11|tor|15:15|Resurstid|C1.05|Panter   |JOE       
Prog|2025-09-11|tor|15:15|Resurstid|C1.06|Ravel    |ELÅ       
Dod |2025-09-12|fre|10:15|DodLabb  |D1.12|Elgkalv  |JOE       
Dod |2025-09-12|fre|10:15|DodLabb  |D1.13|Panter   |ELÅ       
Dod |2025-09-12|fre|10:15|DodLabb  |D1.14|Ravel    |APR       
Dod |2025-09-12|fre|13:15|DodLabb  |C1.04|Elgkalv  |ALL       
Dod |2025-09-12|fre|13:15|DodLabb  |C1.05|Panter   |EBF       
Dod |2025-09-12|fre|13:15|DodLabb  |C1.06|Ravel    |ELÅ       
Prog|2025-09-17|ons|15:15|Resurstid|D1.01|Alfa     |SAR       
Prog|2025-09-17|ons|15:15|Resurstid|D1.02|Beta     |SAJ       
Prog|2025-09-17|ons|15:15|Resurstid|D1.03|Gamma    |ALW       
Prog|2025-09-17|ons|15:15|Resurstid|D1.04|Elg      |JUG       
Prog|2025-09-17|ons|15:15|Resurstid|D1.09|Hacke    |ELÅ       
Prog|2025-09-17|ons|15:15|Resurstid|D1.10|Panter   |NAK       
Prog|2025-09-17|ons|15:15|Resurstid|D1.11|Ravel    |WIS       
Prog|2025-09-17|ons|15:15|Resurstid|D1.12|Falk     |MAU       
Prog|2025-09-17|ons|15:15|Resurstid|D1.13|Val      |MOJ       
Prog|2025-09-17|ons|15:15|Resurstid|D1.14|Varg     |AXF       
Prog|2025-09-17|ons|15:15|Resurstid|XA1  |Ambulans |MEW       
Dod |2025-09-18|tor|10:15|DodLabb  |C1.01|Alfa     |HAE       
Dod |2025-09-18|tor|10:15|DodLabb  |C1.02|Beta     |ELÅ       
Dod |2025-09-18|tor|10:15|DodLabb  |C1.03|Gamma    |APR       
Dod |2025-09-18|tor|10:15|DodLabb  |D1.05|Elg      |AXF       
Dod |2025-09-18|tor|10:15|DodLabb  |D1.06|Hacke    |LIL       
Dod |2025-09-18|tor|10:15|DodLabb  |D1.07|Panter   |WIS       
Dod |2025-09-18|tor|10:15|DodLabb  |D1.08|Ravel    |VIB       
Dod |2025-09-18|tor|10:15|DodLabb  |D1.09|Falk     |JUG       
Dod |2025-09-18|tor|10:15|DodLabb  |D1.10|Val      |JON       
Dod |2025-09-18|tor|10:15|DodLabb  |D1.11|Varg     |MOJ       
Prog|2025-09-18|tor|13:15|Resurstid|D1.05|Alfa     |MOG       
Prog|2025-09-18|tor|13:15|Resurstid|D1.06|Beta     |HAE       
Prog|2025-09-18|tor|13:15|Resurstid|D1.07|Elg      |VIB       
Prog|2025-09-18|tor|13:15|Resurstid|D1.08|Gamma    |APR       
Dod |2025-09-18|tor|13:15|DodLabb  |D1.01|Elgkalv  |ELÅ       
Dod |2025-09-18|tor|13:15|DodLabb  |D1.02|Hacke    |SAR       
Dod |2025-09-18|tor|13:15|DodLabb  |D1.03|Panter   |NAK       
Dod |2025-09-18|tor|13:15|DodLabb  |D1.04|Ravel    |MAU       
Prog|2025-09-18|tor|15:15|Resurstid|C1.01|Falk     |HAE       
Prog|2025-09-18|tor|15:15|Resurstid|C1.02|Val      |ASH       
Prog|2025-09-18|tor|15:15|Resurstid|C1.03|Varg     |JON       
Prog|2025-09-18|tor|15:15|Resurstid|C1.04|Hacke    |APR       
Prog|2025-09-18|tor|15:15|Resurstid|C1.05|Panter   |JOE       
Prog|2025-09-18|tor|15:15|Resurstid|C1.06|Ravel    |KAS       
Prog|2025-09-18|tor|15:15|Resurstid|XA1  |Ambulans |MEW       
Prog|2025-09-19|fre|10:15|ProgLabb |D1.01|Alfa     |AXF       
Prog|2025-09-19|fre|10:15|ProgLabb |D1.02|Beta     |SAJ       
Prog|2025-09-19|fre|10:15|ProgLabb |D1.03|Falk     |ALW       
Prog|2025-09-19|fre|10:15|ProgLabb |D1.04|Gamma    |JUG       
Prog|2025-09-19|fre|10:15|ProgLabb |D1.05|Hacke    |MOG       
Prog|2025-09-19|fre|10:15|ProgLabb |D1.06|Val      |MAB       
Prog|2025-09-19|fre|10:15|ProgLabb |D1.07|Varg     |VIB       
Prog|2025-09-19|fre|10:15|ProgLabb |XA1  |Ambulans1|MOJ       
Prog|2025-09-19|fre|10:15|ProgLabb |XA2  |Ambulans2|HAE       
Prog|2025-09-19|fre|10:15|ProgLabb |XA3  |Ambulans3|ASH       
Prog|2025-09-19|fre|10:15|ProgLabb |XA4  |Ambulans4|KAS       
Dod |2025-09-19|fre|10:15|DodLabb  |D1.12|Elgkalv  |JOE       
Dod |2025-09-19|fre|10:15|DodLabb  |D1.13|Panter   |APR       
Dod |2025-09-19|fre|10:15|DodLabb  |D1.14|Ravel    |WIS       
Prog|2025-09-19|fre|13:15|ProgLabb |D1.08|Alfa     |MAB       
Prog|2025-09-19|fre|13:15|ProgLabb |D1.09|Beta     |ELÅ       
Prog|2025-09-19|fre|13:15|ProgLabb |D1.10|Falk     |NAK       
Prog|2025-09-19|fre|13:15|ProgLabb |D1.11|Gamma    |WIS       
Prog|2025-09-19|fre|13:15|ProgLabb |D1.12|Hacke    |MAU       
Prog|2025-09-19|fre|13:15|ProgLabb |D1.13|Val      |MOJ       
Prog|2025-09-19|fre|13:15|ProgLabb |D1.14|Varg     |KAS       
Prog|2025-09-19|fre|13:15|ProgLabb |XA1  |Ambulans1|ALL       
Prog|2025-09-19|fre|13:15|ProgLabb |XA2  |Ambulans2|EBF       
Prog|2025-09-19|fre|13:15|ProgLabb |XA3  |Ambulans3|JON       
Prog|2025-09-19|fre|13:15|ProgLabb |XA4  |Ambulans4|HAE       
Dod |2025-09-19|fre|13:15|DodLabb  |C1.04|Elgkalv  |APR       
Dod |2025-09-19|fre|13:15|DodLabb  |C1.05|Panter   |JOE       
Dod |2025-09-19|fre|13:15|DodLabb  |C1.06|Ravel    |JUG       
Prog|2025-09-19|fre|15:15|ProgLabb |C1.01|Alfa     |HAE       
Prog|2025-09-19|fre|15:15|ProgLabb |C1.02|Beta     |ASH       
Prog|2025-09-19|fre|15:15|ProgLabb |C1.03|Falk     |JON       
Prog|2025-09-19|fre|15:15|ProgLabb |C1.04|Gamma    |APR       
Prog|2025-09-19|fre|15:15|ProgLabb |C1.05|Val      |JOE       
Prog|2025-09-19|fre|15:15|ProgLabb |C1.06|Varg     |KAS       
Prog|2025-09-19|fre|15:15|ProgLabb |XA1  |Ambulans1|ALL       
Prog|2025-09-19|fre|15:15|ProgLabb |XA2  |Ambulans2|EBF       
Prog|2025-09-19|fre|15:15|ProgLabb |XA3  |Ambulans3|LOL       
Prog|2025-09-19|fre|15:15|ProgLabb |XA4  |Ambulans4|JUG       
Prog|2025-09-24|ons|15:15|Resurstid|D1.01|Alfa     |SAR       
Prog|2025-09-24|ons|15:15|Resurstid|D1.02|Beta     |SAJ       
Prog|2025-09-24|ons|15:15|Resurstid|D1.03|Gamma    |ALW       
Prog|2025-09-24|ons|15:15|Resurstid|D1.04|Elg      |JUG       
Prog|2025-09-24|ons|15:15|Resurstid|D1.09|Hacke    |ELÅ       
Prog|2025-09-24|ons|15:15|Resurstid|D1.10|Panter   |NAK       
Prog|2025-09-24|ons|15:15|Resurstid|D1.11|Ravel    |WIS       
Prog|2025-09-24|ons|15:15|Resurstid|D1.12|Falk     |MAU       
Prog|2025-09-24|ons|15:15|Resurstid|D1.13|Val      |MOJ       
Prog|2025-09-24|ons|15:15|Resurstid|D1.14|Varg     |AXF       
Prog|2025-09-24|ons|15:15|Resurstid|XA1  |Ambulans |MEW       
Dod |2025-09-25|tor|10:15|DodLabb  |C1.01|Alfa     |LOL       
Dod |2025-09-25|tor|10:15|DodLabb  |C1.02|Beta     |ASH       
Dod |2025-09-25|tor|10:15|DodLabb  |C1.03|Gamma    |APR       
Dod |2025-09-25|tor|10:15|DodLabb  |D1.05|Elg      |LIL       
Dod |2025-09-25|tor|10:15|DodLabb  |D1.06|Hacke    |MAB       
Dod |2025-09-25|tor|10:15|DodLabb  |D1.07|Panter   |AXF       
Dod |2025-09-25|tor|10:15|DodLabb  |D1.08|Ravel    |WIS       
Dod |2025-09-25|tor|10:15|DodLabb  |D1.09|Falk     |VIB       
Dod |2025-09-25|tor|10:15|DodLabb  |D1.10|Val      |JON       
Dod |2025-09-25|tor|10:15|DodLabb  |D1.11|Varg     |MOJ       
Prog|2025-09-25|tor|13:15|Resurstid|D1.05|Alfa     |MOG       
Prog|2025-09-25|tor|13:15|Resurstid|D1.06|Beta     |EBF       
Prog|2025-09-25|tor|13:15|Resurstid|D1.07|Elg      |VIB       
Prog|2025-09-25|tor|13:15|Resurstid|D1.08|Gamma    |LOL       
Dod |2025-09-25|tor|13:15|DodLabb  |D1.01|Elgkalv  |MAU       
Dod |2025-09-25|tor|13:15|DodLabb  |D1.02|Hacke    |ELÅ       
Dod |2025-09-25|tor|13:15|DodLabb  |D1.03|Panter   |APR       
Dod |2025-09-25|tor|13:15|DodLabb  |D1.04|Ravel    |SAR       
Prog|2025-09-25|tor|15:15|Resurstid|C1.01|Falk     |HAE       
Prog|2025-09-25|tor|15:15|Resurstid|C1.02|Val      |ASH       
Prog|2025-09-25|tor|15:15|Resurstid|C1.03|Varg     |JON       
Prog|2025-09-25|tor|15:15|Resurstid|C1.04|Hacke    |APR       
Prog|2025-09-25|tor|15:15|Resurstid|C1.05|Panter   |JOE       
Prog|2025-09-25|tor|15:15|Resurstid|C1.06|Ravel    |KAS       
Prog|2025-09-25|tor|15:15|Resurstid|XA1  |Ambulans |MEW       
Prog|2025-09-26|fre|10:15|ProgLabb |D1.01|Alfa     |SAR       
Prog|2025-09-26|fre|10:15|ProgLabb |D1.02|Beta     |SAJ       
Prog|2025-09-26|fre|10:15|ProgLabb |D1.03|Falk     |ALW       
Prog|2025-09-26|fre|10:15|ProgLabb |D1.04|Gamma    |JUG       
Prog|2025-09-26|fre|10:15|ProgLabb |D1.05|Hacke    |MOG       
Prog|2025-09-26|fre|10:15|ProgLabb |D1.06|Val      |MAB       
Prog|2025-09-26|fre|10:15|ProgLabb |D1.07|Varg     |VIB       
Prog|2025-09-26|fre|10:15|ProgLabb |XA1  |Ambulans1|ALL       
Prog|2025-09-26|fre|10:15|ProgLabb |XA2  |Ambulans2|WIS       
Prog|2025-09-26|fre|10:15|ProgLabb |XA3  |Ambulans3|LIL       
Prog|2025-09-26|fre|10:15|ProgLabb |XA4  |Ambulans4|MEW       
Dod |2025-09-26|fre|10:15|DodLabb  |D1.12|Elgkalv  |ELÅ       
Dod |2025-09-26|fre|10:15|DodLabb  |D1.13|Panter   |JOE       
Dod |2025-09-26|fre|10:15|DodLabb  |D1.14|Ravel    |APR       
Prog|2025-09-26|fre|13:15|ProgLabb |D1.08|Alfa     |JUG       
Prog|2025-09-26|fre|13:15|ProgLabb |D1.09|Beta     |ELÅ       
Prog|2025-09-26|fre|13:15|ProgLabb |D1.10|Falk     |NAK       
Prog|2025-09-26|fre|13:15|ProgLabb |D1.11|Gamma    |WIS       
Prog|2025-09-26|fre|13:15|ProgLabb |D1.12|Hacke    |MAU       
Prog|2025-09-26|fre|13:15|ProgLabb |D1.13|Val      |MOJ       
Prog|2025-09-26|fre|13:15|ProgLabb |D1.14|Varg     |AXF       
Prog|2025-09-26|fre|13:15|ProgLabb |XA1  |Ambulans1|ALL       
Prog|2025-09-26|fre|13:15|ProgLabb |XA2  |Ambulans2|EBF       
Prog|2025-09-26|fre|13:15|ProgLabb |XA3  |Ambulans3|LIL       
Prog|2025-09-26|fre|13:15|ProgLabb |XA4  |Ambulans4|MEW       
Dod |2025-09-26|fre|13:15|DodLabb  |C1.04|Elgkalv  |APR       
Dod |2025-09-26|fre|13:15|DodLabb  |C1.05|Panter   |MAB       
Dod |2025-09-26|fre|13:15|DodLabb  |C1.06|Ravel    |SAJ       
Prog|2025-09-26|fre|15:15|ProgLabb |C1.01|Alfa     |HAE       
Prog|2025-09-26|fre|15:15|ProgLabb |C1.02|Beta     |ASH       
Prog|2025-09-26|fre|15:15|ProgLabb |C1.03|Falk     |JON       
Prog|2025-09-26|fre|15:15|ProgLabb |C1.04|Gamma    |APR       
Prog|2025-09-26|fre|15:15|ProgLabb |C1.05|Val      |JOE       
Prog|2025-09-26|fre|15:15|ProgLabb |C1.06|Varg     |KAS       
Prog|2025-09-26|fre|15:15|ProgLabb |XA1  |Ambulans1|LOL       
Prog|2025-09-26|fre|15:15|ProgLabb |XA2  |Ambulans2|EBF       
Prog|2025-09-26|fre|15:15|ProgLabb |XA3  |Ambulans3|LIL       
Prog|2025-09-26|fre|15:15|ProgLabb |XA4  |Ambulans4|MEW       
Prog|2025-10-01|ons|15:15|Resurstid|D1.01|Alfa     |SAR       
Prog|2025-10-01|ons|15:15|Resurstid|D1.02|Beta     |SAJ       
Prog|2025-10-01|ons|15:15|Resurstid|D1.03|Gamma    |ALW       
Prog|2025-10-01|ons|15:15|Resurstid|D1.04|Elg      |JUG       
Prog|2025-10-01|ons|15:15|Resurstid|D1.09|Hacke    |ELÅ       
Prog|2025-10-01|ons|15:15|Resurstid|D1.10|Panter   |NAK       
Prog|2025-10-01|ons|15:15|Resurstid|D1.11|Ravel    |WIS       
Prog|2025-10-01|ons|15:15|Resurstid|D1.12|Falk     |MAU       
Prog|2025-10-01|ons|15:15|Resurstid|D1.13|Val      |MOJ       
Prog|2025-10-01|ons|15:15|Resurstid|D1.14|Varg     |AXF       
Prog|2025-10-01|ons|15:15|Resurstid|XA1  |Ambulans |ALL       
Prog|2025-10-02|tor|13:15|Resurstid|D1.05|Alfa     |MOG       
Prog|2025-10-02|tor|13:15|Resurstid|D1.06|Beta     |ELÅ       
Prog|2025-10-02|tor|13:15|Resurstid|D1.07|Elg      |VIB       
Prog|2025-10-02|tor|13:15|Resurstid|D1.08|Gamma    |KAS       
Prog|2025-10-02|tor|15:15|Resurstid|C1.01|Falk     |HAE       
Prog|2025-10-02|tor|15:15|Resurstid|C1.02|Val      |ASH       
Prog|2025-10-02|tor|15:15|Resurstid|C1.03|Varg     |JON       
Prog|2025-10-02|tor|15:15|Resurstid|C1.04|Hacke    |APR       
Prog|2025-10-02|tor|15:15|Resurstid|C1.05|Panter   |JOE       
Prog|2025-10-02|tor|15:15|Resurstid|C1.06|Ravel    |KAS       
Prog|2025-10-02|tor|15:15|Resurstid|XA1  |Ambulans |ALL       
Prog|2025-10-03|fre|10:15|ProgLabb |D1.01|Alfa     |SAR       
Prog|2025-10-03|fre|10:15|ProgLabb |D1.02|Beta     |SAJ       
Prog|2025-10-03|fre|10:15|ProgLabb |D1.03|Falk     |ALW       
Prog|2025-10-03|fre|10:15|ProgLabb |D1.04|Gamma    |JUG       
Prog|2025-10-03|fre|10:15|ProgLabb |D1.05|Hacke    |MOG       
Prog|2025-10-03|fre|10:15|ProgLabb |D1.06|Val      |AXF       
Prog|2025-10-03|fre|10:15|ProgLabb |D1.07|Varg     |VIB       
Prog|2025-10-03|fre|10:15|ProgLabb |XA1  |Ambulans1|APR       
Prog|2025-10-03|fre|10:15|ProgLabb |XA2  |Ambulans2|JOE       
Prog|2025-10-03|fre|10:15|ProgLabb |XA3  |Ambulans3|WIS       
Prog|2025-10-03|fre|10:15|ProgLabb |XA4  |Ambulans4|MOJ       
Prog|2025-10-03|fre|13:15|ProgLabb |D1.08|Alfa     |APR       
Prog|2025-10-03|fre|13:15|ProgLabb |D1.09|Beta     |ELÅ       
Prog|2025-10-03|fre|13:15|ProgLabb |D1.10|Falk     |NAK       
Prog|2025-10-03|fre|13:15|ProgLabb |D1.11|Gamma    |WIS       
Prog|2025-10-03|fre|13:15|ProgLabb |D1.12|Hacke    |MAU       
Prog|2025-10-03|fre|13:15|ProgLabb |D1.13|Val      |MOJ       
Prog|2025-10-03|fre|13:15|ProgLabb |D1.14|Varg     |SAR       
Prog|2025-10-03|fre|13:15|ProgLabb |XA1  |Ambulans1|JOE       
Prog|2025-10-03|fre|13:15|ProgLabb |XA2  |Ambulans2|EBF       
Prog|2025-10-03|fre|13:15|ProgLabb |XA3  |Ambulans3|SAJ       
Prog|2025-10-03|fre|13:15|ProgLabb |XA4  |Ambulans4|JUG       
Prog|2025-10-03|fre|15:15|ProgLabb |C1.01|Alfa     |HAE       
Prog|2025-10-03|fre|15:15|ProgLabb |C1.02|Beta     |ASH       
Prog|2025-10-03|fre|15:15|ProgLabb |C1.03|Falk     |JON       
Prog|2025-10-03|fre|15:15|ProgLabb |C1.04|Gamma    |APR       
Prog|2025-10-03|fre|15:15|ProgLabb |C1.05|Val      |JOE       
Prog|2025-10-03|fre|15:15|ProgLabb |C1.06|Varg     |KAS       
Prog|2025-10-03|fre|15:15|ProgLabb |XA1  |Ambulans1|JUG       
Prog|2025-10-03|fre|15:15|ProgLabb |XA2  |Ambulans2|NAK       
Prog|2025-10-03|fre|15:15|ProgLabb |XA3  |Ambulans3|WIS       
Prog|2025-10-03|fre|15:15|ProgLabb |XA4  |Ambulans4|SAJ       
Prog|2025-10-08|ons|15:15|Resurstid|D1.01|Alfa     |SAR       
Prog|2025-10-08|ons|15:15|Resurstid|D1.02|Beta     |SAJ       
Prog|2025-10-08|ons|15:15|Resurstid|D1.03|Gamma    |ALW       
Prog|2025-10-08|ons|15:15|Resurstid|D1.04|Elg      |JUG       
Prog|2025-10-08|ons|15:15|Resurstid|D1.09|Hacke    |ELÅ       
Prog|2025-10-08|ons|15:15|Resurstid|D1.10|Panter   |NAK       
Prog|2025-10-08|ons|15:15|Resurstid|D1.11|Ravel    |WIS       
Prog|2025-10-08|ons|15:15|Resurstid|D1.12|Falk     |MAU       
Prog|2025-10-08|ons|15:15|Resurstid|D1.13|Val      |MOJ       
Prog|2025-10-08|ons|15:15|Resurstid|D1.14|Varg     |AXF       
Prog|2025-10-08|ons|15:15|Resurstid|XA1  |Ambulans |LIL       
Prog|2025-10-09|tor|13:15|Resurstid|D1.05|Alfa     |MOG       
Prog|2025-10-09|tor|13:15|Resurstid|D1.06|Beta     |MAB       
Prog|2025-10-09|tor|13:15|Resurstid|D1.07|Elg      |VIB       
Prog|2025-10-09|tor|13:15|Resurstid|D1.08|Gamma    |LOL       
Prog|2025-10-09|tor|13:15|Resurstid|XA1  |Ambulans |LIL       
Prog|2025-10-09|tor|15:15|Resurstid|C1.01|Falk     |HAE       
Prog|2025-10-09|tor|15:15|Resurstid|C1.02|Val      |ASH       
Prog|2025-10-09|tor|15:15|Resurstid|C1.03|Varg     |JON       
Prog|2025-10-09|tor|15:15|Resurstid|C1.04|Hacke    |APR       
Prog|2025-10-09|tor|15:15|Resurstid|C1.05|Panter   |JOE       
Prog|2025-10-09|tor|15:15|Resurstid|C1.06|Ravel    |KAS       
Prog|2025-10-09|tor|15:15|Resurstid|XA1  |Ambulans |LIL       
Prog|2025-10-10|fre|10:15|ProgLabb |D1.01|Alfa     |SAR       
Prog|2025-10-10|fre|10:15|ProgLabb |D1.02|Beta     |SAJ       
Prog|2025-10-10|fre|10:15|ProgLabb |D1.03|Falk     |ALW       
Prog|2025-10-10|fre|10:15|ProgLabb |D1.04|Gamma    |JUG       
Prog|2025-10-10|fre|10:15|ProgLabb |D1.05|Hacke    |MOG       
Prog|2025-10-10|fre|10:15|ProgLabb |D1.06|Val      |MAB       
Prog|2025-10-10|fre|10:15|ProgLabb |D1.07|Varg     |VIB       
Prog|2025-10-10|fre|10:15|ProgLabb |XA1  |Ambulans1|JOE       
Prog|2025-10-10|fre|10:15|ProgLabb |XA2  |Ambulans2|AXF       
Prog|2025-10-10|fre|10:15|ProgLabb |XA3  |Ambulans3|LIL       
Prog|2025-10-10|fre|10:15|ProgLabb |XA4  |Ambulans4|MEW       
Prog|2025-10-10|fre|13:15|ProgLabb |D1.08|Alfa     |MAB       
Prog|2025-10-10|fre|13:15|ProgLabb |D1.09|Beta     |ELÅ       
Prog|2025-10-10|fre|13:15|ProgLabb |D1.10|Falk     |NAK       
Prog|2025-10-10|fre|13:15|ProgLabb |D1.11|Gamma    |WIS       
Prog|2025-10-10|fre|13:15|ProgLabb |D1.12|Hacke    |MAU       
Prog|2025-10-10|fre|13:15|ProgLabb |D1.13|Val      |MOJ       
Prog|2025-10-10|fre|13:15|ProgLabb |D1.14|Varg     |AXF       
Prog|2025-10-10|fre|13:15|ProgLabb |XA1  |Ambulans1|APR       
Prog|2025-10-10|fre|13:15|ProgLabb |XA2  |Ambulans2|JUG       
Prog|2025-10-10|fre|13:15|ProgLabb |XA3  |Ambulans3|SAR       
Prog|2025-10-10|fre|13:15|ProgLabb |XA4  |Ambulans4|MEW       
Prog|2025-10-10|fre|15:15|ProgLabb |C1.01|Alfa     |HAE       
Prog|2025-10-10|fre|15:15|ProgLabb |C1.02|Beta     |ASH       
Prog|2025-10-10|fre|15:15|ProgLabb |C1.03|Falk     |JON       
Prog|2025-10-10|fre|15:15|ProgLabb |C1.04|Gamma    |APR       
Prog|2025-10-10|fre|15:15|ProgLabb |C1.05|Val      |JOE       
Prog|2025-10-10|fre|15:15|ProgLabb |C1.06|Varg     |KAS       
Prog|2025-10-10|fre|15:15|ProgLabb |XA1  |Ambulans1|AXF       
Prog|2025-10-10|fre|15:15|ProgLabb |XA2  |Ambulans2|WIS       
Prog|2025-10-10|fre|15:15|ProgLabb |XA3  |Ambulans3|NAK       
Prog|2025-10-10|fre|15:15|ProgLabb |XA4  |Ambulans4|JUG       
Prog|2025-10-15|ons|15:15|Resurstid|D1.01|Alfa     |SAR       
Prog|2025-10-15|ons|15:15|Resurstid|D1.02|Beta     |SAJ       
Prog|2025-10-15|ons|15:15|Resurstid|D1.03|Gamma    |ALW       
Prog|2025-10-15|ons|15:15|Resurstid|D1.04|Elg      |JUG       
Prog|2025-10-15|ons|15:15|Resurstid|D1.09|Hacke    |ELÅ       
Prog|2025-10-15|ons|15:15|Resurstid|D1.10|Panter   |NAK       
Prog|2025-10-15|ons|15:15|Resurstid|D1.11|Ravel    |WIS       
Prog|2025-10-15|ons|15:15|Resurstid|D1.12|Falk     |MAU       
Prog|2025-10-15|ons|15:15|Resurstid|D1.13|Val      |MOJ       
Prog|2025-10-15|ons|15:15|Resurstid|D1.14|Varg     |AXF       
Prog|2025-10-15|ons|15:15|Resurstid|XA1  |Ambulans |LIL       
Prog|2025-10-16|tor|13:15|Resurstid|D1.05|Alfa     |MOG       
Prog|2025-10-16|tor|13:15|Resurstid|D1.06|Beta     |MAB       
Prog|2025-10-16|tor|13:15|Resurstid|D1.07|Elg      |VIB       
Prog|2025-10-16|tor|13:15|Resurstid|D1.08|Gamma    |LIL       
Prog|2025-10-16|tor|13:15|Resurstid|XA1  |Ambulans |ALL       
Prog|2025-10-16|tor|15:15|Resurstid|C1.01|Falk     |HAE       
Prog|2025-10-16|tor|15:15|Resurstid|C1.02|Val      |ASH       
Prog|2025-10-16|tor|15:15|Resurstid|C1.03|Varg     |JON       
Prog|2025-10-16|tor|15:15|Resurstid|C1.04|Hacke    |APR       
Prog|2025-10-16|tor|15:15|Resurstid|C1.05|Panter   |JOE       
Prog|2025-10-16|tor|15:15|Resurstid|C1.06|Ravel    |KAS       
Prog|2025-10-16|tor|15:15|Resurstid|XA1  |Ambulans |LIL       
Prog|2025-10-17|fre|10:15|ProgLabb |D1.01|Alfa     |SAR       
Prog|2025-10-17|fre|10:15|ProgLabb |D1.02|Beta     |SAJ       
Prog|2025-10-17|fre|10:15|ProgLabb |D1.03|Falk     |ALW       
Prog|2025-10-17|fre|10:15|ProgLabb |D1.04|Gamma    |JUG       
Prog|2025-10-17|fre|10:15|ProgLabb |D1.05|Hacke    |MOG       
Prog|2025-10-17|fre|10:15|ProgLabb |D1.06|Val      |MAB       
Prog|2025-10-17|fre|10:15|ProgLabb |D1.07|Varg     |VIB       
Prog|2025-10-17|fre|10:15|ProgLabb |XA1  |Ambulans1|AXF       
Prog|2025-10-17|fre|10:15|ProgLabb |XA2  |Ambulans2|APR       
Prog|2025-10-17|fre|10:15|ProgLabb |XA3  |Ambulans3|WIS       
Prog|2025-10-17|fre|10:15|ProgLabb |XA4  |Ambulans4|JOE       
Prog|2025-10-17|fre|13:15|ProgLabb |D1.08|Alfa     |APR       
Prog|2025-10-17|fre|13:15|ProgLabb |D1.09|Beta     |ELÅ       
Prog|2025-10-17|fre|13:15|ProgLabb |D1.10|Falk     |NAK       
Prog|2025-10-17|fre|13:15|ProgLabb |D1.11|Gamma    |WIS       
Prog|2025-10-17|fre|13:15|ProgLabb |D1.12|Hacke    |MAU       
Prog|2025-10-17|fre|13:15|ProgLabb |D1.13|Val      |MOJ       
Prog|2025-10-17|fre|13:15|ProgLabb |D1.14|Varg     |MAB       
Prog|2025-10-17|fre|13:15|ProgLabb |XA1  |Ambulans1|JOE       
Prog|2025-10-17|fre|13:15|ProgLabb |XA2  |Ambulans2|JUG       
Prog|2025-10-17|fre|13:15|ProgLabb |XA3  |Ambulans3|ASH       
Prog|2025-10-17|fre|13:15|ProgLabb |XA4  |Ambulans4|ALW       
Prog|2025-10-17|fre|15:15|ProgLabb |C1.01|Alfa     |HAE       
Prog|2025-10-17|fre|15:15|ProgLabb |C1.02|Beta     |ASH       
Prog|2025-10-17|fre|15:15|ProgLabb |C1.03|Falk     |JON       
Prog|2025-10-17|fre|15:15|ProgLabb |C1.04|Gamma    |APR       
Prog|2025-10-17|fre|15:15|ProgLabb |C1.05|Val      |JOE       
Prog|2025-10-17|fre|15:15|ProgLabb |C1.06|Varg     |KAS       
Prog|2025-10-17|fre|15:15|ProgLabb |XA1  |Ambulans1|ALW       
Prog|2025-10-17|fre|15:15|ProgLabb |XA2  |Ambulans2|NAK       
Prog|2025-10-17|fre|15:15|ProgLabb |XA3  |Ambulans3|JUG       
Prog|2025-10-17|fre|15:15|ProgLabb |XA4  |Ambulans4|WIS       
""".trim.split('\n').toSeq