
package kaptenallocweb

val dataGeneratedFromKaptenAlloc: Seq[String] = """
------------------------------------------------------------------
kurs|datum     |dag|kl   |typ      |grupp    |rum      |handledare
------------------------------------------------------------------
pgk |2021-11-03|ons|13:15|Resurstid|D1.09    |Falk     |PSa       
pgk |2021-11-03|ons|13:15|Resurstid|D1.10    |Hacke    |JTh       
pgk |2021-11-03|ons|13:15|Resurstid|D1.11    |Panter   |ELu       
pgk |2021-11-03|ons|13:15|Resurstid|TFRD48.01|Val      |NSa       
pgk |2021-11-03|ons|13:15|Resurstid|XA1      |Ambulans1|FKa       
pgk |2021-11-03|ons|13:15|Resurstid|XA2      |Ambulans |NCe       
pgk |2021-11-03|ons|15:15|Resurstid|D1.05    |Beta     |APh       
pgk |2021-11-03|ons|15:15|Resurstid|D1.06    |Gamma    |IHe       
pgk |2021-11-03|ons|15:15|Resurstid|D1.07    |Hacke    |EBk       
pgk |2021-11-03|ons|15:15|Resurstid|D1.08    |Jupiter  |JSw       
pgk |2021-11-03|ons|15:15|Resurstid|TFRD48.02|Mars     |ECe       
pgk |2021-11-03|ons|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-03|ons|15:15|Resurstid|XA2      |Ambulans |MKu       
pgk |2021-11-04|tor|08:15|Resurstid|C1.04    |Elg      |PWu       
pgk |2021-11-04|tor|08:15|Resurstid|C1.05    |Falk     |EJa       
pgk |2021-11-04|tor|08:15|Resurstid|C1.06    |Hacke    |ESt       
pgk |2021-11-04|tor|08:15|Resurstid|XA1      |Ambulans1|SAl       
pgk |2021-11-04|tor|08:15|Resurstid|XA2      |Ambulans |LAl       
pgk |2021-11-04|tor|10:15|Resurstid|D1.01    |Beta     |NSa       
pgk |2021-11-04|tor|10:15|Resurstid|D1.02    |Falk     |TLu       
pgk |2021-11-04|tor|10:15|Resurstid|D1.03    |Gamma    |EBk       
pgk |2021-11-04|tor|10:15|Resurstid|D1.04    |Hacke    |MKl       
pgk |2021-11-04|tor|10:15|Resurstid|W3.a     |Panter   |MSv       
pgk |2021-11-04|tor|10:15|Resurstid|XA1      |Ambulans1|AGr       
pgk |2021-11-04|tor|10:15|Resurstid|XA2      |Ambulans |IHe       
pgk |2021-11-04|tor|13:15|Resurstid|D1.12    |Hacke    |PGy       
pgk |2021-11-04|tor|13:15|Resurstid|D1.13    |Jupiter  |NCe       
pgk |2021-11-04|tor|13:15|Resurstid|D1.14    |Mars     |FKa       
pgk |2021-11-04|tor|13:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-04|tor|13:15|Resurstid|XA2      |Ambulans |TLu       
pgk |2021-11-04|tor|15:15|Resurstid|C1.01    |Elg      |EBe       
pgk |2021-11-04|tor|15:15|Resurstid|C1.02    |Saturnus |DHe       
pgk |2021-11-04|tor|15:15|Resurstid|C1.03    |Val      |MSv       
pgk |2021-11-04|tor|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-04|tor|15:15|Resurstid|XA2      |Ambulans |SAl       
pgk |2021-11-05|fre|08:15|Labb     |C1.03    |Falk     |MSv       
pgk |2021-11-05|fre|08:15|Labb     |C1.04    |Hacke    |PWu       
pgk |2021-11-05|fre|08:15|Labb     |D1.11    |Panter   |ELu       
pgk |2021-11-05|fre|08:15|Labb     |D1.12    |Saturnus |ESt       
pgk |2021-11-05|fre|08:15|Labb     |D1.13    |Varg     |AGr       
pgk |2021-11-05|fre|08:15|Labb     |D1.14    |Venus    |LAl       
pgk |2021-11-05|fre|08:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-05|fre|08:15|Labb     |XA2      |Ambulans |EBk       
pgk |2021-11-05|fre|08:15|Labb     |XA3      |Ambulans |MKl       
pgk |2021-11-05|fre|13:15|Labb     |C1.01    |Beta     |EBe       
pgk |2021-11-05|fre|13:15|Labb     |C1.02    |Falk     |DHe       
pgk |2021-11-05|fre|13:15|Labb     |D1.01    |Gamma    |SAl       
pgk |2021-11-05|fre|13:15|Labb     |D1.02    |Hacke    |TLu       
pgk |2021-11-05|fre|13:15|Labb     |D1.03    |Jupiter  |FKa       
pgk |2021-11-05|fre|13:15|Labb     |D1.04    |Mars     |MKl       
pgk |2021-11-05|fre|13:15|Labb     |D1.05    |Panter   |APh       
pgk |2021-11-05|fre|13:15|Labb     |W3.a     |Val      |AJo       
pgk |2021-11-05|fre|13:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-05|fre|13:15|Labb     |XA2      |Ambulans |ESt       
pgk |2021-11-05|fre|13:15|Labb     |XA3      |Ambulans |AGr       
pgk |2021-11-05|fre|15:15|Labb     |C1.05    |Elg      |EJa       
pgk |2021-11-05|fre|15:15|Labb     |C1.06    |Falk     |ESt       
pgk |2021-11-05|fre|15:15|Labb     |D1.06    |Hacke    |IHe       
pgk |2021-11-05|fre|15:15|Labb     |D1.07    |Jupiter  |EBk       
pgk |2021-11-05|fre|15:15|Labb     |D1.08    |Mars     |JSw       
pgk |2021-11-05|fre|15:15|Labb     |D1.09    |Panter   |PSa       
pgk |2021-11-05|fre|15:15|Labb     |D1.10    |Saturnus |JTh       
pgk |2021-11-05|fre|15:15|Labb     |TFRD48.01|Val      |NSa       
pgk |2021-11-05|fre|15:15|Labb     |TFRD48.02|Varg     |ECe       
pgk |2021-11-05|fre|15:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-05|fre|15:15|Labb     |XA2      |Ambulans |FKa       
pgk |2021-11-05|fre|15:15|Labb     |XA3      |Ambulans |EBe       
pgk |2021-11-10|ons|13:15|Resurstid|D1.09    |Falk     |PSa       
pgk |2021-11-10|ons|13:15|Resurstid|D1.10    |Hacke    |JTh       
pgk |2021-11-10|ons|13:15|Resurstid|D1.11    |Panter   |ELu       
pgk |2021-11-10|ons|13:15|Resurstid|TFRD48.01|Val      |NSa       
pgk |2021-11-10|ons|13:15|Resurstid|XA1      |Ambulans1|FKa       
pgk |2021-11-10|ons|13:15|Resurstid|XA2      |Ambulans |NCe       
pgk |2021-11-10|ons|15:15|Resurstid|D1.05    |Beta     |APh       
pgk |2021-11-10|ons|15:15|Resurstid|D1.06    |Gamma    |IHe       
pgk |2021-11-10|ons|15:15|Resurstid|D1.07    |Hacke    |EBk       
pgk |2021-11-10|ons|15:15|Resurstid|D1.08    |Jupiter  |JSw       
pgk |2021-11-10|ons|15:15|Resurstid|TFRD48.02|Mars     |ECe       
pgk |2021-11-10|ons|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-10|ons|15:15|Resurstid|XA2      |Ambulans |LAl       
pgk |2021-11-11|tor|08:15|Resurstid|C1.04    |Elg      |PWu       
pgk |2021-11-11|tor|08:15|Resurstid|C1.05    |Falk     |EJa       
pgk |2021-11-11|tor|08:15|Resurstid|C1.06    |Hacke    |ESt       
pgk |2021-11-11|tor|08:15|Resurstid|XA1      |Ambulans1|AJo       
pgk |2021-11-11|tor|08:15|Resurstid|XA2      |Ambulans |LAl       
pgk |2021-11-11|tor|10:15|Resurstid|D1.01    |Beta     |NSa       
pgk |2021-11-11|tor|10:15|Resurstid|D1.02    |Falk     |TLu       
pgk |2021-11-11|tor|10:15|Resurstid|D1.03    |Gamma    |IHe       
pgk |2021-11-11|tor|10:15|Resurstid|D1.04    |Hacke    |JSw       
pgk |2021-11-11|tor|10:15|Resurstid|W3.a     |Panter   |PSa       
pgk |2021-11-11|tor|10:15|Resurstid|XA1      |Ambulans1|SAl       
pgk |2021-11-11|tor|10:15|Resurstid|XA2      |Ambulans |EBk       
pgk |2021-11-11|tor|13:15|Resurstid|D1.12    |Hacke    |PGy       
pgk |2021-11-11|tor|13:15|Resurstid|D1.13    |Jupiter  |NCe       
pgk |2021-11-11|tor|13:15|Resurstid|D1.14    |Mars     |AGr       
pgk |2021-11-11|tor|13:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-11|tor|13:15|Resurstid|XA2      |Ambulans |FKa       
pgk |2021-11-11|tor|15:15|Resurstid|C1.01    |Elg      |EBe       
pgk |2021-11-11|tor|15:15|Resurstid|C1.02    |Saturnus |DHe       
pgk |2021-11-11|tor|15:15|Resurstid|C1.03    |Val      |MSv       
pgk |2021-11-11|tor|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-11|tor|15:15|Resurstid|XA2      |Ambulans |MKu       
pgk |2021-11-12|fre|08:15|Labb     |C1.03    |Falk     |MSv       
pgk |2021-11-12|fre|08:15|Labb     |C1.04    |Hacke    |PWu       
pgk |2021-11-12|fre|08:15|Labb     |D1.11    |Panter   |ELu       
pgk |2021-11-12|fre|08:15|Labb     |D1.12    |Saturnus |ESt       
pgk |2021-11-12|fre|08:15|Labb     |D1.13    |Varg     |EJa       
pgk |2021-11-12|fre|08:15|Labb     |D1.14    |Venus    |LAl       
pgk |2021-11-12|fre|08:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-12|fre|08:15|Labb     |XA2      |Ambulans |EBk       
pgk |2021-11-12|fre|08:15|Labb     |XA3      |Ambulans |MKl       
pgk |2021-11-12|fre|13:15|Labb     |C1.01    |Beta     |EBe       
pgk |2021-11-12|fre|13:15|Labb     |C1.02    |Falk     |DHe       
pgk |2021-11-12|fre|13:15|Labb     |D1.01    |Gamma    |PWu       
pgk |2021-11-12|fre|13:15|Labb     |D1.02    |Hacke    |TLu       
pgk |2021-11-12|fre|13:15|Labb     |D1.03    |Jupiter  |FKa       
pgk |2021-11-12|fre|13:15|Labb     |D1.04    |Mars     |MKl       
pgk |2021-11-12|fre|13:15|Labb     |D1.05    |Panter   |APh       
pgk |2021-11-12|fre|13:15|Labb     |W3.a     |Val      |AJo       
pgk |2021-11-12|fre|13:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-12|fre|13:15|Labb     |XA2      |Ambulans |ESt       
pgk |2021-11-12|fre|13:15|Labb     |XA3      |Ambulans |AGr       
pgk |2021-11-12|fre|15:15|Labb     |C1.05    |Elg      |EJa       
pgk |2021-11-12|fre|15:15|Labb     |C1.06    |Falk     |ESt       
pgk |2021-11-12|fre|15:15|Labb     |D1.06    |Hacke    |IHe       
pgk |2021-11-12|fre|15:15|Labb     |D1.07    |Jupiter  |EBk       
pgk |2021-11-12|fre|15:15|Labb     |D1.08    |Mars     |JSw       
pgk |2021-11-12|fre|15:15|Labb     |D1.09    |Panter   |PSa       
pgk |2021-11-12|fre|15:15|Labb     |D1.10    |Saturnus |JTh       
pgk |2021-11-12|fre|15:15|Labb     |TFRD48.01|Val      |NSa       
pgk |2021-11-12|fre|15:15|Labb     |TFRD48.02|Varg     |ECe       
pgk |2021-11-12|fre|15:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-12|fre|15:15|Labb     |XA2      |Ambulans |FKa       
pgk |2021-11-12|fre|15:15|Labb     |XA3      |Ambulans |PWu       
pgk |2021-11-17|ons|13:15|Resurstid|D1.09    |Falk     |AGr       
pgk |2021-11-17|ons|13:15|Resurstid|D1.10    |Hacke    |JTh       
pgk |2021-11-17|ons|13:15|Resurstid|D1.11    |Panter   |ELu       
pgk |2021-11-17|ons|13:15|Resurstid|TFRD48.01|Val      |APh       
pgk |2021-11-17|ons|13:15|Resurstid|XA1      |Ambulans1|FKa       
pgk |2021-11-17|ons|13:15|Resurstid|XA2      |Ambulans |NCe       
pgk |2021-11-17|ons|15:15|Resurstid|D1.05    |Beta     |APh       
pgk |2021-11-17|ons|15:15|Resurstid|D1.06    |Gamma    |IHe       
pgk |2021-11-17|ons|15:15|Resurstid|D1.07    |Hacke    |EBk       
pgk |2021-11-17|ons|15:15|Resurstid|D1.08    |Jupiter  |JSw       
pgk |2021-11-17|ons|15:15|Resurstid|TFRD48.02|Mars     |ECe       
pgk |2021-11-17|ons|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-17|ons|15:15|Resurstid|XA2      |Ambulans |LAl       
pgk |2021-11-18|tor|08:15|Resurstid|C1.04    |Elg      |PWu       
pgk |2021-11-18|tor|08:15|Resurstid|C1.05    |Falk     |EJa       
pgk |2021-11-18|tor|08:15|Resurstid|C1.06    |Hacke    |ESt       
pgk |2021-11-18|tor|08:15|Resurstid|XA1      |Ambulans1|LAl       
pgk |2021-11-18|tor|08:15|Resurstid|XA2      |Ambulans |TLu       
pgk |2021-11-18|tor|10:15|Resurstid|D1.01    |Beta     |ECe       
pgk |2021-11-18|tor|10:15|Resurstid|D1.02    |Falk     |TLu       
pgk |2021-11-18|tor|10:15|Resurstid|D1.03    |Gamma    |SAl       
pgk |2021-11-18|tor|10:15|Resurstid|D1.04    |Hacke    |MSv       
pgk |2021-11-18|tor|10:15|Resurstid|W3.a     |Panter   |JSw       
pgk |2021-11-18|tor|10:15|Resurstid|XA1      |Ambulans1|ESt       
pgk |2021-11-18|tor|10:15|Resurstid|XA2      |Ambulans |EBk       
pgk |2021-11-18|tor|13:15|Resurstid|D1.12    |Hacke    |PGy       
pgk |2021-11-18|tor|13:15|Resurstid|D1.13    |Jupiter  |NCe       
pgk |2021-11-18|tor|13:15|Resurstid|D1.14    |Mars     |EBe       
pgk |2021-11-18|tor|13:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-18|tor|13:15|Resurstid|XA2      |Ambulans |TLu       
pgk |2021-11-18|tor|15:15|Resurstid|C1.01    |Elg      |EBe       
pgk |2021-11-18|tor|15:15|Resurstid|C1.02    |Saturnus |DHe       
pgk |2021-11-18|tor|15:15|Resurstid|C1.03    |Val      |MSv       
pgk |2021-11-18|tor|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-18|tor|15:15|Resurstid|XA2      |Ambulans |MKu       
pgk |2021-11-19|fre|08:15|Labb     |C1.03    |Falk     |MSv       
pgk |2021-11-19|fre|08:15|Labb     |C1.04    |Hacke    |PWu       
pgk |2021-11-19|fre|08:15|Labb     |D1.11    |Panter   |ELu       
pgk |2021-11-19|fre|08:15|Labb     |D1.12    |Saturnus |EJa       
pgk |2021-11-19|fre|08:15|Labb     |D1.13    |Varg     |EBk       
pgk |2021-11-19|fre|08:15|Labb     |D1.14    |Venus    |LAl       
pgk |2021-11-19|fre|08:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-19|fre|08:15|Labb     |XA2      |Ambulans |ECe       
pgk |2021-11-19|fre|08:15|Labb     |XA3      |Ambulans |JTh       
pgk |2021-11-19|fre|13:15|Labb     |C1.01    |Beta     |EBe       
pgk |2021-11-19|fre|13:15|Labb     |C1.02    |Falk     |DHe       
pgk |2021-11-19|fre|13:15|Labb     |D1.01    |Gamma    |PWu       
pgk |2021-11-19|fre|13:15|Labb     |D1.02    |Hacke    |TLu       
pgk |2021-11-19|fre|13:15|Labb     |D1.03    |Jupiter  |MSv       
pgk |2021-11-19|fre|13:15|Labb     |D1.04    |Mars     |EBk       
pgk |2021-11-19|fre|13:15|Labb     |D1.05    |Panter   |APh       
pgk |2021-11-19|fre|13:15|Labb     |W3.a     |Val      |AJo       
pgk |2021-11-19|fre|13:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-19|fre|13:15|Labb     |XA2      |Ambulans |ECe       
pgk |2021-11-19|fre|15:15|Labb     |C1.05    |Elg      |EJa       
pgk |2021-11-19|fre|15:15|Labb     |C1.06    |Falk     |APh       
pgk |2021-11-19|fre|15:15|Labb     |D1.06    |Hacke    |IHe       
pgk |2021-11-19|fre|15:15|Labb     |D1.07    |Jupiter  |EBk       
pgk |2021-11-19|fre|15:15|Labb     |D1.08    |Mars     |JSw       
pgk |2021-11-19|fre|15:15|Labb     |D1.09    |Panter   |PWu       
pgk |2021-11-19|fre|15:15|Labb     |D1.10    |Saturnus |MKu       
pgk |2021-11-19|fre|15:15|Labb     |TFRD48.01|Val      |NSa       
pgk |2021-11-19|fre|15:15|Labb     |TFRD48.02|Varg     |ECe       
pgk |2021-11-19|fre|15:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-19|fre|15:15|Labb     |XA2      |Ambulans |EBe       
pgk |2021-11-24|ons|13:15|Resurstid|D1.09    |Falk     |PSa       
pgk |2021-11-24|ons|13:15|Resurstid|D1.10    |Hacke    |JTh       
pgk |2021-11-24|ons|13:15|Resurstid|D1.11    |Panter   |ELu       
pgk |2021-11-24|ons|13:15|Resurstid|TFRD48.01|Val      |NSa       
pgk |2021-11-24|ons|13:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-24|ons|13:15|Resurstid|XA2      |Ambulans |FKa       
pgk |2021-11-24|ons|15:15|Resurstid|D1.05    |Beta     |APh       
pgk |2021-11-24|ons|15:15|Resurstid|D1.06    |Gamma    |IHe       
pgk |2021-11-24|ons|15:15|Resurstid|D1.07    |Hacke    |EBk       
pgk |2021-11-24|ons|15:15|Resurstid|D1.08    |Jupiter  |JSw       
pgk |2021-11-24|ons|15:15|Resurstid|TFRD48.02|Mars     |ECe       
pgk |2021-11-24|ons|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-24|ons|15:15|Resurstid|XA2      |Ambulans |LAl       
pgk |2021-11-25|tor|08:15|Resurstid|C1.04    |Elg      |PWu       
pgk |2021-11-25|tor|08:15|Resurstid|C1.05    |Falk     |EJa       
pgk |2021-11-25|tor|08:15|Resurstid|C1.06    |Hacke    |ESt       
pgk |2021-11-25|tor|08:15|Resurstid|XA1      |Ambulans1|AJo       
pgk |2021-11-25|tor|08:15|Resurstid|XA2      |Ambulans |TLu       
pgk |2021-11-25|tor|10:15|Resurstid|D1.01    |Beta     |PWu       
pgk |2021-11-25|tor|10:15|Resurstid|D1.02    |Falk     |TLu       
pgk |2021-11-25|tor|10:15|Resurstid|D1.03    |Gamma    |SAl       
pgk |2021-11-25|tor|10:15|Resurstid|D1.04    |Hacke    |MKl       
pgk |2021-11-25|tor|10:15|Resurstid|W3.a     |Panter   |MSv       
pgk |2021-11-25|tor|10:15|Resurstid|XA1      |Ambulans1|DHe       
pgk |2021-11-25|tor|10:15|Resurstid|XA2      |Ambulans |EBk       
pgk |2021-11-25|tor|13:15|Resurstid|D1.12    |Hacke    |PGy       
pgk |2021-11-25|tor|13:15|Resurstid|D1.13    |Jupiter  |NCe       
pgk |2021-11-25|tor|13:15|Resurstid|D1.14    |Mars     |AGr       
pgk |2021-11-25|tor|13:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-25|tor|13:15|Resurstid|XA2      |Ambulans |TLu       
pgk |2021-11-25|tor|15:15|Resurstid|C1.01    |Elg      |EBe       
pgk |2021-11-25|tor|15:15|Resurstid|C1.02    |Saturnus |DHe       
pgk |2021-11-25|tor|15:15|Resurstid|C1.03    |Val      |MSv       
pgk |2021-11-25|tor|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-11-25|tor|15:15|Resurstid|XA2      |Ambulans |MKu       
pgk |2021-11-26|fre|08:15|Labb     |C1.03    |Falk     |MSv       
pgk |2021-11-26|fre|08:15|Labb     |C1.04    |Hacke    |MKl       
pgk |2021-11-26|fre|08:15|Labb     |D1.11    |Panter   |ELu       
pgk |2021-11-26|fre|08:15|Labb     |D1.12    |Saturnus |ECe       
pgk |2021-11-26|fre|08:15|Labb     |D1.13    |Varg     |EBk       
pgk |2021-11-26|fre|08:15|Labb     |D1.14    |Venus    |LAl       
pgk |2021-11-26|fre|08:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-26|fre|08:15|Labb     |XA2      |Ambulans |EJa       
pgk |2021-11-26|fre|13:15|Labb     |C1.01    |Beta     |EBe       
pgk |2021-11-26|fre|13:15|Labb     |C1.02    |Falk     |DHe       
pgk |2021-11-26|fre|13:15|Labb     |D1.01    |Gamma    |EBk       
pgk |2021-11-26|fre|13:15|Labb     |D1.02    |Hacke    |TLu       
pgk |2021-11-26|fre|13:15|Labb     |D1.03    |Jupiter  |FKa       
pgk |2021-11-26|fre|13:15|Labb     |D1.04    |Mars     |MKl       
pgk |2021-11-26|fre|13:15|Labb     |D1.05    |Panter   |APh       
pgk |2021-11-26|fre|13:15|Labb     |W3.a     |Val      |AJo       
pgk |2021-11-26|fre|13:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-26|fre|13:15|Labb     |XA2      |Ambulans |ESt       
pgk |2021-11-26|fre|13:15|Labb     |XA3      |Ambulans |MSv       
pgk |2021-11-26|fre|15:15|Labb     |C1.05    |Elg      |EJa       
pgk |2021-11-26|fre|15:15|Labb     |C1.06    |Falk     |ESt       
pgk |2021-11-26|fre|15:15|Labb     |D1.06    |Hacke    |IHe       
pgk |2021-11-26|fre|15:15|Labb     |D1.07    |Jupiter  |EBk       
pgk |2021-11-26|fre|15:15|Labb     |D1.08    |Mars     |JSw       
pgk |2021-11-26|fre|15:15|Labb     |D1.09    |Panter   |FKa       
pgk |2021-11-26|fre|15:15|Labb     |D1.10    |Saturnus |JTh       
pgk |2021-11-26|fre|15:15|Labb     |TFRD48.01|Val      |NSa       
pgk |2021-11-26|fre|15:15|Labb     |TFRD48.02|Varg     |ECe       
pgk |2021-11-26|fre|15:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-11-26|fre|15:15|Labb     |XA2      |Ambulans |MKu       
pgk |2021-11-26|fre|15:15|Labb     |XA3      |Ambulans |EBe       
pgk |2021-12-01|ons|13:15|Resurstid|D1.09    |Falk     |PSa       
pgk |2021-12-01|ons|13:15|Resurstid|D1.10    |Hacke    |JTh       
pgk |2021-12-01|ons|13:15|Resurstid|D1.11    |Panter   |ELu       
pgk |2021-12-01|ons|13:15|Resurstid|TFRD48.01|Val      |FKa       
pgk |2021-12-01|ons|13:15|Resurstid|XA1      |Ambulans1|APh       
pgk |2021-12-01|ons|13:15|Resurstid|XA2      |Ambulans |NCe       
pgk |2021-12-01|ons|15:15|Resurstid|D1.05    |Beta     |APh       
pgk |2021-12-01|ons|15:15|Resurstid|D1.06    |Gamma    |IHe       
pgk |2021-12-01|ons|15:15|Resurstid|D1.07    |Hacke    |EBk       
pgk |2021-12-01|ons|15:15|Resurstid|D1.08    |Jupiter  |JSw       
pgk |2021-12-01|ons|15:15|Resurstid|TFRD48.02|Mars     |ECe       
pgk |2021-12-01|ons|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-12-01|ons|15:15|Resurstid|XA2      |Ambulans |FKa       
pgk |2021-12-02|tor|08:15|Resurstid|C1.04    |Elg      |PWu       
pgk |2021-12-02|tor|08:15|Resurstid|C1.05    |Falk     |EJa       
pgk |2021-12-02|tor|08:15|Resurstid|C1.06    |Hacke    |ESt       
pgk |2021-12-02|tor|08:15|Resurstid|XA1      |Ambulans1|AGr       
pgk |2021-12-02|tor|08:15|Resurstid|XA2      |Ambulans |TLu       
pgk |2021-12-02|tor|10:15|Resurstid|D1.01    |Beta     |SAl       
pgk |2021-12-02|tor|10:15|Resurstid|D1.02    |Falk     |TLu       
pgk |2021-12-02|tor|10:15|Resurstid|D1.03    |Gamma    |EBk       
pgk |2021-12-02|tor|10:15|Resurstid|D1.04    |Hacke    |MKl       
pgk |2021-12-02|tor|10:15|Resurstid|W3.a     |Panter   |DHe       
pgk |2021-12-02|tor|10:15|Resurstid|XA1      |Ambulans1|ESt       
pgk |2021-12-02|tor|10:15|Resurstid|XA2      |Ambulans |MSv       
pgk |2021-12-02|tor|13:15|Resurstid|D1.12    |Hacke    |PGy       
pgk |2021-12-02|tor|13:15|Resurstid|D1.13    |Jupiter  |NCe       
pgk |2021-12-02|tor|13:15|Resurstid|D1.14    |Mars     |DHe       
pgk |2021-12-02|tor|13:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-12-02|tor|13:15|Resurstid|XA2      |Ambulans |EBk       
pgk |2021-12-02|tor|15:15|Resurstid|C1.01    |Elg      |NCe       
pgk |2021-12-02|tor|15:15|Resurstid|C1.02    |Saturnus |DHe       
pgk |2021-12-02|tor|15:15|Resurstid|C1.03    |Val      |MSv       
pgk |2021-12-02|tor|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-12-02|tor|15:15|Resurstid|XA2      |Ambulans |PGy       
pgk |2021-12-03|fre|08:15|Labb     |C1.03    |Falk     |MSv       
pgk |2021-12-03|fre|08:15|Labb     |C1.04    |Hacke    |PWu       
pgk |2021-12-03|fre|08:15|Labb     |D1.11    |Panter   |ELu       
pgk |2021-12-03|fre|08:15|Labb     |D1.12    |Saturnus |MKl       
pgk |2021-12-03|fre|08:15|Labb     |D1.13    |Varg     |EBk       
pgk |2021-12-03|fre|08:15|Labb     |D1.14    |Venus    |LAl       
pgk |2021-12-03|fre|08:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-12-03|fre|08:15|Labb     |XA2      |Ambulans |EJa       
pgk |2021-12-03|fre|08:15|Labb     |XA3      |Ambulans |ECe       
pgk |2021-12-03|fre|13:15|Labb     |C1.01    |Beta     |EBe       
pgk |2021-12-03|fre|13:15|Labb     |C1.02    |Falk     |DHe       
pgk |2021-12-03|fre|13:15|Labb     |D1.01    |Gamma    |PWu       
pgk |2021-12-03|fre|13:15|Labb     |D1.02    |Hacke    |EBk       
pgk |2021-12-03|fre|13:15|Labb     |D1.03    |Jupiter  |MSv       
pgk |2021-12-03|fre|13:15|Labb     |D1.04    |Mars     |MKl       
pgk |2021-12-03|fre|13:15|Labb     |D1.05    |Panter   |APh       
pgk |2021-12-03|fre|13:15|Labb     |W3.a     |Val      |AJo       
pgk |2021-12-03|fre|13:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-12-03|fre|13:15|Labb     |XA2      |Ambulans |NSa       
pgk |2021-12-03|fre|15:15|Labb     |C1.05    |Elg      |EJa       
pgk |2021-12-03|fre|15:15|Labb     |C1.06    |Falk     |PWu       
pgk |2021-12-03|fre|15:15|Labb     |D1.06    |Hacke    |IHe       
pgk |2021-12-03|fre|15:15|Labb     |D1.07    |Jupiter  |EBk       
pgk |2021-12-03|fre|15:15|Labb     |D1.08    |Mars     |JSw       
pgk |2021-12-03|fre|15:15|Labb     |D1.09    |Panter   |APh       
pgk |2021-12-03|fre|15:15|Labb     |D1.10    |Saturnus |MSv       
pgk |2021-12-03|fre|15:15|Labb     |TFRD48.01|Val      |NSa       
pgk |2021-12-03|fre|15:15|Labb     |TFRD48.02|Varg     |ECe       
pgk |2021-12-03|fre|15:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-12-03|fre|15:15|Labb     |XA2      |Ambulans |EBe       
pgk |2021-12-08|ons|13:15|Resurstid|D1.09    |Falk     |FKa       
pgk |2021-12-08|ons|13:15|Resurstid|D1.10    |Hacke    |JTh       
pgk |2021-12-08|ons|13:15|Resurstid|D1.11    |Panter   |ELu       
pgk |2021-12-08|ons|13:15|Resurstid|TFRD48.01|Val      |NSa       
pgk |2021-12-08|ons|13:15|Resurstid|XA1      |Ambulans1|EBe       
pgk |2021-12-08|ons|13:15|Resurstid|XA2      |Ambulans |NCe       
pgk |2021-12-08|ons|15:15|Resurstid|D1.05    |Beta     |APh       
pgk |2021-12-08|ons|15:15|Resurstid|D1.06    |Gamma    |IHe       
pgk |2021-12-08|ons|15:15|Resurstid|D1.07    |Hacke    |EBk       
pgk |2021-12-08|ons|15:15|Resurstid|D1.08    |Jupiter  |JSw       
pgk |2021-12-08|ons|15:15|Resurstid|TFRD48.02|Mars     |ECe       
pgk |2021-12-08|ons|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-12-08|ons|15:15|Resurstid|XA2      |Ambulans |MKu       
pgk |2021-12-09|tor|08:15|Resurstid|C1.04    |Elg      |PWu       
pgk |2021-12-09|tor|08:15|Resurstid|C1.05    |Falk     |EJa       
pgk |2021-12-09|tor|08:15|Resurstid|C1.06    |Hacke    |ESt       
pgk |2021-12-09|tor|08:15|Resurstid|XA1      |Ambulans1|LAl       
pgk |2021-12-09|tor|08:15|Resurstid|XA2      |Ambulans |PGy       
pgk |2021-12-09|tor|10:15|Resurstid|D1.01    |Beta     |EJa       
pgk |2021-12-09|tor|10:15|Resurstid|D1.02    |Falk     |TLu       
pgk |2021-12-09|tor|10:15|Resurstid|D1.03    |Gamma    |SAl       
pgk |2021-12-09|tor|10:15|Resurstid|D1.04    |Hacke    |MKl       
pgk |2021-12-09|tor|10:15|Resurstid|W3.a     |Panter   |ELu       
pgk |2021-12-09|tor|10:15|Resurstid|XA1      |Ambulans1|ESt       
pgk |2021-12-09|tor|10:15|Resurstid|XA2      |Ambulans |EBe       
pgk |2021-12-09|tor|13:15|Resurstid|D1.12    |Hacke    |PGy       
pgk |2021-12-09|tor|13:15|Resurstid|D1.13    |Jupiter  |NCe       
pgk |2021-12-09|tor|13:15|Resurstid|D1.14    |Mars     |EBe       
pgk |2021-12-09|tor|13:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-12-09|tor|13:15|Resurstid|XA2      |Ambulans |EBk       
pgk |2021-12-09|tor|15:15|Resurstid|C1.01    |Elg      |EBe       
pgk |2021-12-09|tor|15:15|Resurstid|C1.02    |Saturnus |DHe       
pgk |2021-12-09|tor|15:15|Resurstid|C1.03    |Val      |MSv       
pgk |2021-12-09|tor|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-12-09|tor|15:15|Resurstid|XA2      |Ambulans |MKu       
pgk |2021-12-10|fre|08:15|Labb     |C1.03    |Falk     |MSv       
pgk |2021-12-10|fre|08:15|Labb     |C1.04    |Hacke    |PWu       
pgk |2021-12-10|fre|08:15|Labb     |D1.11    |Panter   |ELu       
pgk |2021-12-10|fre|08:15|Labb     |D1.12    |Saturnus |AGr       
pgk |2021-12-10|fre|08:15|Labb     |D1.13    |Varg     |ESt       
pgk |2021-12-10|fre|08:15|Labb     |D1.14    |Venus    |LAl       
pgk |2021-12-10|fre|08:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-12-10|fre|08:15|Labb     |XA2      |Ambulans |EBk       
pgk |2021-12-10|fre|08:15|Labb     |XA3      |Ambulans |MKl       
pgk |2021-12-10|fre|13:15|Labb     |C1.01    |Beta     |EBe       
pgk |2021-12-10|fre|13:15|Labb     |C1.02    |Falk     |DHe       
pgk |2021-12-10|fre|13:15|Labb     |D1.01    |Gamma    |SAl       
pgk |2021-12-10|fre|13:15|Labb     |D1.02    |Hacke    |TLu       
pgk |2021-12-10|fre|13:15|Labb     |D1.03    |Jupiter  |FKa       
pgk |2021-12-10|fre|13:15|Labb     |D1.04    |Mars     |MKl       
pgk |2021-12-10|fre|13:15|Labb     |D1.05    |Panter   |APh       
pgk |2021-12-10|fre|13:15|Labb     |W3.a     |Val      |AJo       
pgk |2021-12-10|fre|13:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-12-10|fre|13:15|Labb     |XA2      |Ambulans |PWu       
pgk |2021-12-10|fre|13:15|Labb     |XA3      |Ambulans |ESt       
pgk |2021-12-10|fre|15:15|Labb     |C1.05    |Elg      |EJa       
pgk |2021-12-10|fre|15:15|Labb     |C1.06    |Falk     |ESt       
pgk |2021-12-10|fre|15:15|Labb     |D1.06    |Hacke    |IHe       
pgk |2021-12-10|fre|15:15|Labb     |D1.07    |Jupiter  |EBk       
pgk |2021-12-10|fre|15:15|Labb     |D1.08    |Mars     |JSw       
pgk |2021-12-10|fre|15:15|Labb     |D1.09    |Panter   |PSa       
pgk |2021-12-10|fre|15:15|Labb     |D1.10    |Saturnus |JTh       
pgk |2021-12-10|fre|15:15|Labb     |TFRD48.01|Val      |NSa       
pgk |2021-12-10|fre|15:15|Labb     |TFRD48.02|Varg     |ECe       
pgk |2021-12-10|fre|15:15|Labb     |XA1      |Ambulans1|FBe       
pgk |2021-12-10|fre|15:15|Labb     |XA2      |Ambulans |FKa       
pgk |2021-12-10|fre|15:15|Labb     |XA3      |Ambulans |PWu       
pgk |2021-12-15|ons|13:15|Resurstid|D1.09    |Falk     |PSa       
pgk |2021-12-15|ons|13:15|Resurstid|D1.10    |Hacke    |JTh       
pgk |2021-12-15|ons|13:15|Resurstid|D1.11    |Panter   |ELu       
pgk |2021-12-15|ons|13:15|Resurstid|TFRD48.01|Val      |NSa       
pgk |2021-12-15|ons|13:15|Resurstid|XA1      |Ambulans1|AGr       
pgk |2021-12-15|ons|13:15|Resurstid|XA2      |Ambulans |FKa       
pgk |2021-12-15|ons|15:15|Resurstid|D1.05    |Beta     |APh       
pgk |2021-12-15|ons|15:15|Resurstid|D1.06    |Gamma    |IHe       
pgk |2021-12-15|ons|15:15|Resurstid|D1.07    |Hacke    |EBk       
pgk |2021-12-15|ons|15:15|Resurstid|D1.08    |Jupiter  |JSw       
pgk |2021-12-15|ons|15:15|Resurstid|TFRD48.02|Mars     |ECe       
pgk |2021-12-15|ons|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-12-15|ons|15:15|Resurstid|XA2      |Ambulans |MKu       
pgk |2021-12-16|tor|08:15|Resurstid|C1.04    |Elg      |PWu       
pgk |2021-12-16|tor|08:15|Resurstid|C1.05    |Falk     |EJa       
pgk |2021-12-16|tor|08:15|Resurstid|C1.06    |Hacke    |ESt       
pgk |2021-12-16|tor|08:15|Resurstid|XA1      |Ambulans1|AJo       
pgk |2021-12-16|tor|08:15|Resurstid|XA2      |Ambulans |PGy       
pgk |2021-12-16|tor|10:15|Resurstid|D1.01    |Beta     |PWu       
pgk |2021-12-16|tor|10:15|Resurstid|D1.02    |Falk     |TLu       
pgk |2021-12-16|tor|10:15|Resurstid|D1.03    |Gamma    |IHe       
pgk |2021-12-16|tor|10:15|Resurstid|D1.04    |Hacke    |MKl       
pgk |2021-12-16|tor|10:15|Resurstid|W3.a     |Panter   |ECe       
pgk |2021-12-16|tor|10:15|Resurstid|XA1      |Ambulans1|ELu       
pgk |2021-12-16|tor|10:15|Resurstid|XA2      |Ambulans |EBk       
pgk |2021-12-16|tor|13:15|Resurstid|D1.12    |Hacke    |PGy       
pgk |2021-12-16|tor|13:15|Resurstid|D1.13    |Jupiter  |NCe       
pgk |2021-12-16|tor|13:15|Resurstid|D1.14    |Mars     |PWu       
pgk |2021-12-16|tor|13:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-12-16|tor|13:15|Resurstid|XA2      |Ambulans |EBk       
pgk |2021-12-16|tor|15:15|Resurstid|C1.01    |Elg      |PGy       
pgk |2021-12-16|tor|15:15|Resurstid|C1.02    |Saturnus |TLu       
pgk |2021-12-16|tor|15:15|Resurstid|C1.03    |Val      |EJa       
pgk |2021-12-16|tor|15:15|Resurstid|XA1      |Ambulans1|FBe       
pgk |2021-12-16|tor|15:15|Resurstid|XA2      |Ambulans |NCe       
pgk |2021-12-17|fre|08:15|Labb     |C1.03    |Falk     |ELu       
pgk |2021-12-17|fre|08:15|Labb     |C1.04    |Hacke    |PWu       
pgk |2021-12-17|fre|08:15|Labb     |D1.11    |Panter   |FBe       
pgk |2021-12-17|fre|08:15|Labb     |D1.12    |Saturnus |IHe       
pgk |2021-12-17|fre|08:15|Labb     |D1.13    |Varg     |EBk       
pgk |2021-12-17|fre|08:15|Labb     |D1.14    |Venus    |MKl       
pgk |2021-12-17|fre|08:15|Labb     |XA1      |Ambulans1|NCe       
pgk |2021-12-17|fre|08:15|Labb     |XA2      |Ambulans |LAl       
pgk |2021-12-17|fre|13:15|Labb     |C1.01    |Beta     |EBe       
pgk |2021-12-17|fre|13:15|Labb     |C1.02    |Falk     |ECe       
pgk |2021-12-17|fre|13:15|Labb     |D1.01    |Gamma    |PWu       
pgk |2021-12-17|fre|13:15|Labb     |D1.02    |Hacke    |TLu       
pgk |2021-12-17|fre|13:15|Labb     |D1.03    |Jupiter  |PSa       
pgk |2021-12-17|fre|13:15|Labb     |D1.04    |Mars     |MKl       
pgk |2021-12-17|fre|13:15|Labb     |D1.05    |Panter   |APh       
pgk |2021-12-17|fre|13:15|Labb     |W3.a     |Val      |NSa       
pgk |2021-12-17|fre|13:15|Labb     |XA1      |Ambulans1|EBk       
pgk |2021-12-17|fre|13:15|Labb     |XA2      |Ambulans |JSw       
pgk |2021-12-17|fre|15:15|Labb     |C1.05    |Elg      |EJa       
pgk |2021-12-17|fre|15:15|Labb     |C1.06    |Falk     |PWu       
pgk |2021-12-17|fre|15:15|Labb     |D1.06    |Hacke    |APh       
pgk |2021-12-17|fre|15:15|Labb     |D1.07    |Jupiter  |EBk       
pgk |2021-12-17|fre|15:15|Labb     |D1.08    |Mars     |NSa       
pgk |2021-12-17|fre|15:15|Labb     |D1.09    |Panter   |PSa       
pgk |2021-12-17|fre|15:15|Labb     |D1.10    |Saturnus |JTh       
pgk |2021-12-17|fre|15:15|Labb     |TFRD48.01|Val      |EBe       
pgk |2021-12-17|fre|15:15|Labb     |TFRD48.02|Varg     |ECe       
pgk |2021-12-17|fre|15:15|Labb     |XA1      |Ambulans1|MKu       
pgk |2021-12-17|fre|15:15|Labb     |XA2      |Ambulans |JSw       
""".trim.split('\n').toSeq
