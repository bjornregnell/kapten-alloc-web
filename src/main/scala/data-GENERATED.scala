
package kaptenallocweb

val dataGeneratedFromKaptenAlloc: Seq[String] = """
-----------------------------------------------------------------
kurs|datum     |dag|kl   |typ      |grupp    |rum     |handledare
-----------------------------------------------------------------
pgk |2021-09-01|ons|10:15|Resurstid|D1.01    |Falk    |PWu       
pgk |2021-09-01|ons|10:15|Resurstid|D1.02    |Gamma   |MBe       
pgk |2021-09-01|ons|10:15|Resurstid|D1.03    |Hacke   |ELu       
pgk |2021-09-01|ons|10:15|Resurstid|D1.04    |Panter  |EBe       
pgk |2021-09-01|ons|10:15|Resurstid|TFRD48.01|Varg    |NSa       
pgk |2021-09-01|ons|10:15|Resurstid|XA1      |Ambulans|EJa       
pgk |2021-09-01|ons|10:15|Resurstid|XA2      |Ambulans|MKu       
pgk |2021-09-01|ons|13:15|Resurstid|D1.09    |Falk    |SAl       
pgk |2021-09-01|ons|13:15|Resurstid|D1.10    |Gamma   |EBe       
pgk |2021-09-01|ons|13:15|Resurstid|D1.11    |Hacke   |PWu       
pgk |2021-09-01|ons|13:15|Resurstid|TFRD48.02|Panter  |ECe       
pgk |2021-09-01|ons|13:15|Resurstid|W3.a     |Val     |FBe       
pgk |2021-09-01|ons|13:15|Resurstid|XA1      |Ambulans|EKr       
pgk |2021-09-01|ons|13:15|Resurstid|XA2      |Ambulans|JSw       
pgk |2021-09-01|ons|15:15|Resurstid|D1.05    |Gamma   |LAl       
pgk |2021-09-01|ons|15:15|Resurstid|D1.06    |Hacke   |AJo       
pgk |2021-09-01|ons|15:15|Resurstid|D1.07    |Jupiter |MSv       
pgk |2021-09-01|ons|15:15|Resurstid|D1.08    |Mars    |JSw       
pgk |2021-09-01|ons|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-09-01|ons|15:15|Resurstid|XA2      |Ambulans|EJa       
pgk |2021-09-02|tor|08:15|Resurstid|C1.04    |Falk    |NCe       
pgk |2021-09-02|tor|08:15|Resurstid|C1.05    |Jupiter |EKr       
pgk |2021-09-02|tor|08:15|Resurstid|C1.06    |Val     |JTh       
pgk |2021-09-02|tor|08:15|Resurstid|XA1      |Ambulans|PGy       
pgk |2021-09-02|tor|08:15|Resurstid|XA2      |Ambulans|EJa       
pgk |2021-09-02|tor|10:15|Resurstid|D1.12    |Falk    |DHe       
pgk |2021-09-02|tor|10:15|Resurstid|D1.13    |Hacke   |MKu       
pgk |2021-09-02|tor|10:15|Resurstid|D1.14    |Panter  |APh       
pgk |2021-09-02|tor|10:15|Resurstid|XA1      |Ambulans|FBe       
pgk |2021-09-02|tor|10:15|Resurstid|XA2      |Ambulans|EKr       
dod |2021-09-02|tor|13:15|Datorlabb|C1.01    |Beta    |FBe       
dod |2021-09-02|tor|13:15|Datorlabb|C1.02    |Falk    |PSa       
dod |2021-09-02|tor|13:15|Datorlabb|C1.03    |Gamma   |EKr       
dod |2021-09-02|tor|13:15|Datorlabb|D1.08    |Hacke   |JSw       
dod |2021-09-02|tor|13:15|Datorlabb|D1.09    |Panter  |PWu       
dod |2021-09-02|tor|13:15|Datorlabb|D1.10    |Varg    |EBe       
pgk |2021-09-02|tor|15:15|Resurstid|C1.01    |Beta    |TLu       
pgk |2021-09-02|tor|15:15|Resurstid|C1.02    |Gamma   |PSa       
pgk |2021-09-02|tor|15:15|Resurstid|C1.03    |Venus   |ESt       
pgk |2021-09-02|tor|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-09-02|tor|15:15|Resurstid|XA2      |Ambulans|EJa       
dod |2021-09-02|tor|15:15|Datorlabb|C1.04    |Falk    |NCe       
dod |2021-09-02|tor|15:15|Datorlabb|C1.05    |Hacke   |EKr       
dod |2021-09-02|tor|15:15|Datorlabb|C1.06    |Mars    |JTh       
dod |2021-09-02|tor|15:15|Datorlabb|D1.01    |Panter  |EBe       
dod |2021-09-02|tor|15:15|Datorlabb|D1.02    |Val     |APh       
dod |2021-09-02|tor|15:15|Datorlabb|D1.03    |Varg    |ELu       
pgk |2021-09-03|fre|10:15|Labb     |C1.03    |Elg     |ESt       
pgk |2021-09-03|fre|10:15|Labb     |C1.04    |Falk    |NCe       
pgk |2021-09-03|fre|10:15|Labb     |D1.11    |Gamma   |DHe       
pgk |2021-09-03|fre|10:15|Labb     |D1.12    |Hacke   |PGy       
pgk |2021-09-03|fre|10:15|Labb     |D1.13    |Jupiter |EKr       
pgk |2021-09-03|fre|10:15|Labb     |D1.14    |Mars    |APh       
pgk |2021-09-03|fre|10:15|Labb     |TFRD48.01|Panter  |NSa       
pgk |2021-09-03|fre|10:15|Labb     |TFRD48.02|Val     |ECe       
pgk |2021-09-03|fre|10:15|Labb     |XA1      |Ambulans|PSa       
pgk |2021-09-03|fre|10:15|Labb     |XA2      |Ambulans|PWu       
pgk |2021-09-03|fre|10:15|Labb     |XA3      |Ambulans|FBe       
pgk |2021-09-03|fre|10:15|Labb     |XA4      |Ambulans|MSv       
pgk |2021-09-03|fre|13:15|Labb     |C1.01    |Elg     |TLu       
pgk |2021-09-03|fre|13:15|Labb     |C1.02    |Falk    |PSa       
pgk |2021-09-03|fre|13:15|Labb     |D1.01    |Gamma   |PWu       
pgk |2021-09-03|fre|13:15|Labb     |D1.02    |Hacke   |MBe       
pgk |2021-09-03|fre|13:15|Labb     |D1.03    |Jupiter |ELu       
pgk |2021-09-03|fre|13:15|Labb     |D1.04    |Mars    |EBe       
pgk |2021-09-03|fre|13:15|Labb     |D1.05    |Panter  |LAl       
pgk |2021-09-03|fre|13:15|Labb     |W3.a     |Venus   |FBe       
pgk |2021-09-03|fre|13:15|Labb     |XA1      |Ambulans|AGr       
pgk |2021-09-03|fre|13:15|Labb     |XA2      |Ambulans|FKa       
pgk |2021-09-03|fre|13:15|Labb     |XA3      |Ambulans|MKu       
pgk |2021-09-03|fre|13:15|Labb     |XA4      |Ambulans|EKr       
pgk |2021-09-03|fre|15:15|Labb     |C1.05    |Alfa    |EKr       
pgk |2021-09-03|fre|15:15|Labb     |C1.06    |Beta    |JTh       
pgk |2021-09-03|fre|15:15|Labb     |D1.06    |Gamma   |AJo       
pgk |2021-09-03|fre|15:15|Labb     |D1.07    |Hacke   |MSv       
pgk |2021-09-03|fre|15:15|Labb     |D1.08    |Jupiter |JSw       
pgk |2021-09-03|fre|15:15|Labb     |D1.09    |Mars    |SAl       
pgk |2021-09-03|fre|15:15|Labb     |D1.10    |Panter  |EBe       
pgk |2021-09-03|fre|15:15|Labb     |XA1      |Ambulans|EJa       
pgk |2021-09-03|fre|15:15|Labb     |XA2      |Ambulans|AGr       
pgk |2021-09-03|fre|15:15|Labb     |XA3      |Ambulans|FKa       
pgk |2021-09-03|fre|15:15|Labb     |XA4      |Ambulans|EBe       
dod |2021-09-07|tis|08:15|Datorlabb|D1.11    |Beta    |PWu       
dod |2021-09-07|tis|08:15|Datorlabb|D1.12    |Falk    |PGy       
dod |2021-09-07|tis|08:15|Datorlabb|D1.13    |Gamma   |FBe       
dod |2021-09-07|tis|08:15|Datorlabb|D1.14    |Hacke   |NCe       
dod |2021-09-07|tis|10:15|Datorlabb|D1.04    |Falk    |JSw       
dod |2021-09-07|tis|10:15|Datorlabb|D1.05    |Gamma   |APh       
dod |2021-09-07|tis|10:15|Datorlabb|D1.06    |Hacke   |PWu       
dod |2021-09-07|tis|10:15|Datorlabb|D1.07    |Panter  |FBe       
pgk |2021-09-08|ons|10:15|Resurstid|D1.01    |Falk    |PWu       
pgk |2021-09-08|ons|10:15|Resurstid|D1.02    |Gamma   |MBe       
pgk |2021-09-08|ons|10:15|Resurstid|D1.03    |Hacke   |ELu       
pgk |2021-09-08|ons|10:15|Resurstid|D1.04    |Panter  |EJa       
pgk |2021-09-08|ons|10:15|Resurstid|TFRD48.01|Varg    |NSa       
pgk |2021-09-08|ons|10:15|Resurstid|XA1      |Ambulans|MKu       
pgk |2021-09-08|ons|10:15|Resurstid|XA2      |Ambulans|FBe       
pgk |2021-09-08|ons|13:15|Resurstid|D1.09    |Falk    |SAl       
pgk |2021-09-08|ons|13:15|Resurstid|D1.10    |Gamma   |EBe       
pgk |2021-09-08|ons|13:15|Resurstid|D1.11    |Hacke   |PWu       
pgk |2021-09-08|ons|13:15|Resurstid|TFRD48.02|Panter  |ECe       
pgk |2021-09-08|ons|13:15|Resurstid|W3.a     |Val     |FBe       
pgk |2021-09-08|ons|13:15|Resurstid|XA1      |Ambulans|EKr       
pgk |2021-09-08|ons|13:15|Resurstid|XA2      |Ambulans|JSw       
pgk |2021-09-08|ons|15:15|Resurstid|D1.05    |Gamma   |LAl       
pgk |2021-09-08|ons|15:15|Resurstid|D1.06    |Hacke   |AJo       
pgk |2021-09-08|ons|15:15|Resurstid|D1.07    |Jupiter |MSv       
pgk |2021-09-08|ons|15:15|Resurstid|D1.08    |Mars    |JSw       
pgk |2021-09-08|ons|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-09-08|ons|15:15|Resurstid|XA2      |Ambulans|EJa       
pgk |2021-09-09|tor|08:15|Resurstid|C1.04    |Falk    |NCe       
pgk |2021-09-09|tor|08:15|Resurstid|C1.05    |Jupiter |EKr       
pgk |2021-09-09|tor|08:15|Resurstid|C1.06    |Val     |JTh       
pgk |2021-09-09|tor|08:15|Resurstid|XA1      |Ambulans|PGy       
pgk |2021-09-09|tor|08:15|Resurstid|XA2      |Ambulans|EJa       
dod |2021-09-09|tor|13:15|Datorlabb|D1.07    |Falk    |AJo       
dod |2021-09-09|tor|13:15|Datorlabb|D1.08    |Gamma   |JSw       
dod |2021-09-09|tor|13:15|Datorlabb|D1.09    |Hacke   |EKr       
dod |2021-09-09|tor|13:15|Datorlabb|D1.10    |Jupiter |EBe       
dod |2021-09-09|tor|13:15|Datorlabb|D1.11    |Mars    |PSa       
dod |2021-09-09|tor|13:15|Datorlabb|D1.12    |Panter  |PWu       
dod |2021-09-09|tor|13:15|Datorlabb|D1.13    |Val     |FKa       
dod |2021-09-09|tor|13:15|Datorlabb|D1.14    |Varg    |FBe       
pgk |2021-09-09|tor|15:15|Resurstid|C1.01    |Beta    |TLu       
pgk |2021-09-09|tor|15:15|Resurstid|C1.02    |Gamma   |PSa       
pgk |2021-09-09|tor|15:15|Resurstid|C1.03    |Venus   |ESt       
pgk |2021-09-09|tor|15:15|Resurstid|XA1      |Ambulans|DHe       
pgk |2021-09-09|tor|15:15|Resurstid|XA2      |Ambulans|EJa       
dod |2021-09-09|tor|15:15|Datorlabb|D1.01    |Falk    |FKa       
dod |2021-09-09|tor|15:15|Datorlabb|D1.02    |Hacke   |EKr       
dod |2021-09-09|tor|15:15|Datorlabb|D1.03    |Jupiter |JTh       
dod |2021-09-09|tor|15:15|Datorlabb|D1.04    |Mars    |EBe       
dod |2021-09-09|tor|15:15|Datorlabb|D1.05    |Panter  |APh       
dod |2021-09-09|tor|15:15|Datorlabb|D1.06    |Varg    |ECe       
pgk |2021-09-10|fre|10:15|Resurstid|D1.12    |Falk    |PGy       
pgk |2021-09-10|fre|10:15|Resurstid|D1.13    |Hacke   |MKu       
pgk |2021-09-10|fre|10:15|Resurstid|D1.14    |Panter  |APh       
pgk |2021-09-10|fre|10:15|Resurstid|XA1      |Ambulans|DHe       
pgk |2021-09-10|fre|10:15|Resurstid|XA2      |Ambulans|FBe       
dod |2021-09-14|tis|08:15|Datorlabb|D1.11    |Beta    |PWu       
dod |2021-09-14|tis|08:15|Datorlabb|D1.12    |Falk    |PGy       
dod |2021-09-14|tis|08:15|Datorlabb|D1.13    |Gamma   |AJo       
dod |2021-09-14|tis|08:15|Datorlabb|D1.14    |Hacke   |FBe       
dod |2021-09-14|tis|10:15|Datorlabb|D1.04    |Falk    |APh       
dod |2021-09-14|tis|10:15|Datorlabb|D1.05    |Gamma   |JTh       
dod |2021-09-14|tis|10:15|Datorlabb|D1.06    |Hacke   |FBe       
dod |2021-09-14|tis|10:15|Datorlabb|D1.07    |Panter  |TLu       
pgk |2021-09-15|ons|10:15|Resurstid|D1.01    |Falk    |PWu       
pgk |2021-09-15|ons|10:15|Resurstid|D1.02    |Gamma   |MBe       
pgk |2021-09-15|ons|10:15|Resurstid|D1.03    |Hacke   |ELu       
pgk |2021-09-15|ons|10:15|Resurstid|D1.04    |Panter  |EJa       
pgk |2021-09-15|ons|10:15|Resurstid|TFRD48.01|Varg    |NSa       
pgk |2021-09-15|ons|10:15|Resurstid|XA1      |Ambulans|MKu       
pgk |2021-09-15|ons|10:15|Resurstid|XA2      |Ambulans|FBe       
pgk |2021-09-15|ons|13:15|Resurstid|D1.09    |Falk    |SAl       
pgk |2021-09-15|ons|13:15|Resurstid|D1.10    |Gamma   |EBe       
pgk |2021-09-15|ons|13:15|Resurstid|D1.11    |Hacke   |MBe       
pgk |2021-09-15|ons|13:15|Resurstid|TFRD48.02|Panter  |ECe       
pgk |2021-09-15|ons|13:15|Resurstid|W3.a     |Val     |FBe       
pgk |2021-09-15|ons|13:15|Resurstid|XA1      |Ambulans|EKr       
pgk |2021-09-15|ons|13:15|Resurstid|XA2      |Ambulans|PWu       
pgk |2021-09-15|ons|15:15|Resurstid|D1.05    |Gamma   |LAl       
pgk |2021-09-15|ons|15:15|Resurstid|D1.06    |Hacke   |AJo       
pgk |2021-09-15|ons|15:15|Resurstid|D1.07    |Jupiter |MSv       
pgk |2021-09-15|ons|15:15|Resurstid|D1.08    |Mars    |JSw       
pgk |2021-09-15|ons|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-09-15|ons|15:15|Resurstid|XA2      |Ambulans|EJa       
pgk |2021-09-16|tor|08:15|Resurstid|C1.04    |Falk    |NCe       
pgk |2021-09-16|tor|08:15|Resurstid|C1.05    |Jupiter |EKr       
pgk |2021-09-16|tor|08:15|Resurstid|C1.06    |Val     |JTh       
pgk |2021-09-16|tor|08:15|Resurstid|XA1      |Ambulans|PGy       
pgk |2021-09-16|tor|08:15|Resurstid|XA2      |Ambulans|FBe       
pgk |2021-09-16|tor|10:15|Resurstid|D1.12    |Falk    |FBe       
pgk |2021-09-16|tor|10:15|Resurstid|D1.13    |Hacke   |EKr       
pgk |2021-09-16|tor|10:15|Resurstid|D1.14    |Panter  |SAl       
pgk |2021-09-16|tor|10:15|Resurstid|XA1      |Ambulans|EBe       
dod |2021-09-16|tor|13:15|Datorlabb|C1.01    |Falk    |TLu       
dod |2021-09-16|tor|13:15|Datorlabb|C1.02    |Hacke   |FBe       
dod |2021-09-16|tor|13:15|Datorlabb|C1.03    |Jupiter |ESt       
dod |2021-09-16|tor|13:15|Datorlabb|D1.08    |Mars    |JSw       
dod |2021-09-16|tor|13:15|Datorlabb|D1.09    |Panter  |NCe       
dod |2021-09-16|tor|13:15|Datorlabb|D1.10    |Varg    |EBe       
pgk |2021-09-16|tor|15:15|Resurstid|C1.01    |Alfa    |TLu       
pgk |2021-09-16|tor|15:15|Resurstid|C1.02    |Beta    |PSa       
pgk |2021-09-16|tor|15:15|Resurstid|C1.03    |Elg     |ESt       
pgk |2021-09-16|tor|15:15|Resurstid|XA1      |Ambulans|DHe       
pgk |2021-09-16|tor|15:15|Resurstid|XA2      |Ambulans|EJa       
dod |2021-09-16|tor|15:15|Datorlabb|C1.04    |Falk    |NCe       
dod |2021-09-16|tor|15:15|Datorlabb|C1.05    |Hacke   |EKr       
dod |2021-09-16|tor|15:15|Datorlabb|C1.06    |Jupiter |MNo       
dod |2021-09-16|tor|15:15|Datorlabb|D1.01    |Panter  |FKa       
dod |2021-09-16|tor|15:15|Datorlabb|D1.02    |Varg    |AJo       
dod |2021-09-16|tor|15:15|Datorlabb|D1.03    |Venus   |FBe       
pgk |2021-09-17|fre|10:15|Labb     |C1.03    |Elg     |ESt       
pgk |2021-09-17|fre|10:15|Labb     |C1.04    |Falk    |NCe       
pgk |2021-09-17|fre|10:15|Labb     |D1.11    |Gamma   |DHe       
pgk |2021-09-17|fre|10:15|Labb     |D1.12    |Hacke   |PGy       
pgk |2021-09-17|fre|10:15|Labb     |D1.13    |Jupiter |MKu       
pgk |2021-09-17|fre|10:15|Labb     |D1.14    |Mars    |APh       
pgk |2021-09-17|fre|10:15|Labb     |TFRD48.01|Panter  |NSa       
pgk |2021-09-17|fre|10:15|Labb     |TFRD48.02|Saturnus|ECe       
pgk |2021-09-17|fre|10:15|Labb     |XA1      |Ambulans|PWu       
pgk |2021-09-17|fre|10:15|Labb     |XA2      |Ambulans|FBe       
pgk |2021-09-17|fre|10:15|Labb     |XA3      |Ambulans|MSv       
pgk |2021-09-17|fre|13:15|Labb     |C1.01    |Elg     |TLu       
pgk |2021-09-17|fre|13:15|Labb     |C1.02    |Falk    |DHe       
pgk |2021-09-17|fre|13:15|Labb     |D1.01    |Gamma   |PWu       
pgk |2021-09-17|fre|13:15|Labb     |D1.02    |Hacke   |MBe       
pgk |2021-09-17|fre|13:15|Labb     |D1.03    |Jupiter |ELu       
pgk |2021-09-17|fre|13:15|Labb     |D1.04    |Mars    |FKa       
pgk |2021-09-17|fre|13:15|Labb     |D1.05    |Panter  |LAl       
pgk |2021-09-17|fre|13:15|Labb     |W3.a     |Venus   |FBe       
pgk |2021-09-17|fre|13:15|Labb     |XA1      |Ambulans|NCe       
pgk |2021-09-17|fre|13:15|Labb     |XA2      |Ambulans|MSv       
pgk |2021-09-17|fre|13:15|Labb     |XA3      |Ambulans|AJo       
pgk |2021-09-17|fre|15:15|Labb     |C1.05    |Alfa    |AGr       
pgk |2021-09-17|fre|15:15|Labb     |C1.06    |Beta    |JTh       
pgk |2021-09-17|fre|15:15|Labb     |D1.06    |Gamma   |AJo       
pgk |2021-09-17|fre|15:15|Labb     |D1.07    |Hacke   |MSv       
pgk |2021-09-17|fre|15:15|Labb     |D1.08    |Jupiter |JSw       
pgk |2021-09-17|fre|15:15|Labb     |D1.09    |Mars    |SAl       
pgk |2021-09-17|fre|15:15|Labb     |D1.10    |Panter  |EBe       
pgk |2021-09-17|fre|15:15|Labb     |XA1      |Ambulans|EJa       
pgk |2021-09-17|fre|15:15|Labb     |XA2      |Ambulans|FKa       
pgk |2021-09-17|fre|15:15|Labb     |XA3      |Ambulans|EBe       
pgk |2021-09-17|fre|15:15|Labb     |XA4      |Ambulans|PSa       
pgk |2021-09-22|ons|13:15|Resurstid|D1.01    |Beta    |PWu       
pgk |2021-09-22|ons|13:15|Resurstid|D1.02    |Gamma   |MBe       
pgk |2021-09-22|ons|13:15|Resurstid|D1.03    |Hacke   |ELu       
pgk |2021-09-22|ons|13:15|Resurstid|D1.04    |Jupiter |EBe       
pgk |2021-09-22|ons|13:15|Resurstid|TFRD48.02|Mars    |ECe       
pgk |2021-09-22|ons|13:15|Resurstid|W3.a     |Panter  |FBe       
pgk |2021-09-22|ons|13:15|Resurstid|XA1      |Ambulans|JSw       
pgk |2021-09-22|ons|15:15|Resurstid|D1.05    |Gamma   |LAl       
pgk |2021-09-22|ons|15:15|Resurstid|D1.06    |Hacke   |AJo       
pgk |2021-09-22|ons|15:15|Resurstid|D1.07    |Jupiter |MSv       
pgk |2021-09-22|ons|15:15|Resurstid|D1.08    |Mars    |JSw       
pgk |2021-09-22|ons|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-09-22|ons|15:15|Resurstid|XA2      |Ambulans|EJa       
pgk |2021-09-23|tor|08:15|Resurstid|C1.04    |Falk    |NCe       
pgk |2021-09-23|tor|08:15|Resurstid|C1.05    |Jupiter |EKr       
pgk |2021-09-23|tor|08:15|Resurstid|C1.06    |Val     |JTh       
pgk |2021-09-23|tor|08:15|Resurstid|XA1      |Ambulans|PGy       
pgk |2021-09-23|tor|08:15|Resurstid|XA2      |Ambulans|EJa       
pgk |2021-09-23|tor|10:15|Resurstid|D1.12    |Falk    |DHe       
pgk |2021-09-23|tor|10:15|Resurstid|D1.13    |Hacke   |MKu       
pgk |2021-09-23|tor|10:15|Resurstid|D1.14    |Panter  |APh       
pgk |2021-09-23|tor|10:15|Resurstid|XA1      |Ambulans|EJa       
pgk |2021-09-23|tor|10:15|Resurstid|XA2      |Ambulans|EBe       
pgk |2021-09-23|tor|13:15|Resurstid|D1.09    |Falk    |SAl       
pgk |2021-09-23|tor|13:15|Resurstid|D1.10    |Gamma   |EBe       
pgk |2021-09-23|tor|13:15|Resurstid|D1.11    |Hacke   |DHe       
pgk |2021-09-23|tor|13:15|Resurstid|TFRD48.01|Panter  |NSa       
pgk |2021-09-23|tor|13:15|Resurstid|XA1      |Val     |FKa       
pgk |2021-09-23|tor|13:15|Resurstid|XA2      |Ambulans|AGr       
pgk |2021-09-23|tor|15:15|Resurstid|C1.01    |Alfa    |TLu       
pgk |2021-09-23|tor|15:15|Resurstid|C1.02    |Beta    |PSa       
pgk |2021-09-23|tor|15:15|Resurstid|C1.03    |Elg     |ESt       
pgk |2021-09-23|tor|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-09-23|tor|15:15|Resurstid|XA2      |Ambulans|AGr       
pgk |2021-09-24|fre|10:15|Labb     |C1.03    |Elg     |ESt       
pgk |2021-09-24|fre|10:15|Labb     |C1.04    |Falk    |NCe       
pgk |2021-09-24|fre|10:15|Labb     |D1.11    |Gamma   |DHe       
pgk |2021-09-24|fre|10:15|Labb     |D1.12    |Hacke   |PGy       
pgk |2021-09-24|fre|10:15|Labb     |D1.13    |Jupiter |MKu       
pgk |2021-09-24|fre|10:15|Labb     |D1.14    |Mars    |APh       
pgk |2021-09-24|fre|10:15|Labb     |TFRD48.01|Panter  |NSa       
pgk |2021-09-24|fre|10:15|Labb     |TFRD48.02|Val     |ECe       
pgk |2021-09-24|fre|10:15|Labb     |XA1      |Ambulans|AGr       
pgk |2021-09-24|fre|10:15|Labb     |XA2      |Ambulans|PWu       
pgk |2021-09-24|fre|10:15|Labb     |XA3      |Ambulans|FBe       
pgk |2021-09-24|fre|10:15|Labb     |XA4      |Ambulans|EKr       
pgk |2021-09-24|fre|13:15|Labb     |C1.01    |Elg     |TLu       
pgk |2021-09-24|fre|13:15|Labb     |C1.02    |Falk    |EKr       
pgk |2021-09-24|fre|13:15|Labb     |D1.01    |Gamma   |PWu       
pgk |2021-09-24|fre|13:15|Labb     |D1.02    |Hacke   |MBe       
pgk |2021-09-24|fre|13:15|Labb     |D1.03    |Jupiter |ELu       
pgk |2021-09-24|fre|13:15|Labb     |D1.04    |Mars    |FKa       
pgk |2021-09-24|fre|13:15|Labb     |D1.05    |Panter  |LAl       
pgk |2021-09-24|fre|13:15|Labb     |W3.a     |Venus   |FBe       
pgk |2021-09-24|fre|13:15|Labb     |XA1      |Ambulans|DHe       
pgk |2021-09-24|fre|13:15|Labb     |XA2      |Ambulans|NCe       
pgk |2021-09-24|fre|13:15|Labb     |XA3      |Ambulans|MSv       
pgk |2021-09-24|fre|13:15|Labb     |XA4      |Ambulans|AJo       
pgk |2021-09-24|fre|15:15|Labb     |C1.05    |Alfa    |EKr       
pgk |2021-09-24|fre|15:15|Labb     |C1.06    |Beta    |JTh       
pgk |2021-09-24|fre|15:15|Labb     |D1.06    |Gamma   |AJo       
pgk |2021-09-24|fre|15:15|Labb     |D1.07    |Hacke   |MSv       
pgk |2021-09-24|fre|15:15|Labb     |D1.08    |Jupiter |JSw       
pgk |2021-09-24|fre|15:15|Labb     |D1.09    |Mars    |SAl       
pgk |2021-09-24|fre|15:15|Labb     |D1.10    |Panter  |EBe       
pgk |2021-09-24|fre|15:15|Labb     |XA1      |Ambulans|EJa       
pgk |2021-09-24|fre|15:15|Labb     |XA2      |Ambulans|AGr       
pgk |2021-09-24|fre|15:15|Labb     |XA3      |Ambulans|FKa       
pgk |2021-09-24|fre|15:15|Labb     |XA4      |Ambulans|EBe       
pgk |2021-09-29|ons|10:15|Resurstid|D1.01    |Falk    |PWu       
pgk |2021-09-29|ons|10:15|Resurstid|D1.02    |Gamma   |MBe       
pgk |2021-09-29|ons|10:15|Resurstid|D1.03    |Hacke   |ELu       
pgk |2021-09-29|ons|10:15|Resurstid|D1.04    |Panter  |EBe       
pgk |2021-09-29|ons|10:15|Resurstid|TFRD48.01|Varg    |NSa       
pgk |2021-09-29|ons|10:15|Resurstid|XA1      |Ambulans|AGr       
pgk |2021-09-29|ons|10:15|Resurstid|XA2      |Ambulans|FBe       
pgk |2021-09-29|ons|13:15|Resurstid|D1.09    |Falk    |SAl       
pgk |2021-09-29|ons|13:15|Resurstid|D1.10    |Gamma   |EBe       
pgk |2021-09-29|ons|13:15|Resurstid|D1.11    |Hacke   |MBe       
pgk |2021-09-29|ons|13:15|Resurstid|TFRD48.02|Panter  |ECe       
pgk |2021-09-29|ons|13:15|Resurstid|W3.a     |Val     |FBe       
pgk |2021-09-29|ons|13:15|Resurstid|XA1      |Ambulans|EKr       
pgk |2021-09-29|ons|13:15|Resurstid|XA2      |Ambulans|PWu       
pgk |2021-09-29|ons|15:15|Resurstid|D1.05    |Gamma   |LAl       
pgk |2021-09-29|ons|15:15|Resurstid|D1.06    |Hacke   |AJo       
pgk |2021-09-29|ons|15:15|Resurstid|D1.07    |Jupiter |MSv       
pgk |2021-09-29|ons|15:15|Resurstid|D1.08    |Mars    |JSw       
pgk |2021-09-29|ons|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-09-29|ons|15:15|Resurstid|XA2      |Ambulans|APh       
pgk |2021-09-30|tor|08:15|Resurstid|C1.04    |Falk    |NCe       
pgk |2021-09-30|tor|08:15|Resurstid|C1.05    |Jupiter |EKr       
pgk |2021-09-30|tor|08:15|Resurstid|C1.06    |Val     |JTh       
pgk |2021-09-30|tor|08:15|Resurstid|XA1      |Ambulans|PGy       
pgk |2021-09-30|tor|08:15|Resurstid|XA2      |Ambulans|FBe       
pgk |2021-09-30|tor|10:15|Resurstid|D1.12    |Falk    |FBe       
pgk |2021-09-30|tor|10:15|Resurstid|D1.13    |Hacke   |EKr       
pgk |2021-09-30|tor|10:15|Resurstid|D1.14    |Panter  |SAl       
pgk |2021-09-30|tor|10:15|Resurstid|XA1      |Ambulans|EBe       
pgk |2021-09-30|tor|15:15|Resurstid|C1.01    |Alfa    |TLu       
pgk |2021-09-30|tor|15:15|Resurstid|C1.02    |Beta    |PSa       
pgk |2021-09-30|tor|15:15|Resurstid|C1.03    |Elg     |ESt       
pgk |2021-09-30|tor|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-09-30|tor|15:15|Resurstid|XA2      |Ambulans|DHe       
pgk |2021-10-01|fre|10:15|Labb     |C1.03    |Elg     |ESt       
pgk |2021-10-01|fre|10:15|Labb     |C1.04    |Falk    |NCe       
pgk |2021-10-01|fre|10:15|Labb     |D1.11    |Gamma   |DHe       
pgk |2021-10-01|fre|10:15|Labb     |D1.12    |Hacke   |PGy       
pgk |2021-10-01|fre|10:15|Labb     |D1.13    |Jupiter |MKu       
pgk |2021-10-01|fre|10:15|Labb     |D1.14    |Mars    |APh       
pgk |2021-10-01|fre|10:15|Labb     |TFRD48.01|Panter  |NSa       
pgk |2021-10-01|fre|10:15|Labb     |TFRD48.02|Saturnus|ECe       
pgk |2021-10-01|fre|10:15|Labb     |XA1      |Ambulans|PWu       
pgk |2021-10-01|fre|10:15|Labb     |XA2      |Ambulans|FBe       
pgk |2021-10-01|fre|10:15|Labb     |XA3      |Ambulans|MSv       
pgk |2021-10-01|fre|13:15|Labb     |C1.01    |Elg     |TLu       
pgk |2021-10-01|fre|13:15|Labb     |C1.02    |Falk    |PSa       
pgk |2021-10-01|fre|13:15|Labb     |D1.01    |Gamma   |PWu       
pgk |2021-10-01|fre|13:15|Labb     |D1.02    |Hacke   |MBe       
pgk |2021-10-01|fre|13:15|Labb     |D1.03    |Jupiter |ELu       
pgk |2021-10-01|fre|13:15|Labb     |D1.04    |Mars    |EBe       
pgk |2021-10-01|fre|13:15|Labb     |D1.05    |Panter  |LAl       
pgk |2021-10-01|fre|13:15|Labb     |W3.a     |Venus   |FBe       
pgk |2021-10-01|fre|13:15|Labb     |XA1      |Ambulans|FKa       
pgk |2021-10-01|fre|13:15|Labb     |XA2      |Ambulans|DHe       
pgk |2021-10-01|fre|13:15|Labb     |XA3      |Ambulans|SAl       
pgk |2021-10-01|fre|13:15|Labb     |XA4      |Ambulans|NCe       
pgk |2021-10-01|fre|15:15|Labb     |C1.05    |Alfa    |EJa       
pgk |2021-10-01|fre|15:15|Labb     |C1.06    |Beta    |JTh       
pgk |2021-10-01|fre|15:15|Labb     |D1.06    |Gamma   |AJo       
pgk |2021-10-01|fre|15:15|Labb     |D1.07    |Hacke   |MSv       
pgk |2021-10-01|fre|15:15|Labb     |D1.08    |Jupiter |JSw       
pgk |2021-10-01|fre|15:15|Labb     |D1.09    |Mars    |SAl       
pgk |2021-10-01|fre|15:15|Labb     |D1.10    |Panter  |EBe       
pgk |2021-10-01|fre|15:15|Labb     |XA1      |Ambulans|FKa       
pgk |2021-10-01|fre|15:15|Labb     |XA2      |Ambulans|EBe       
pgk |2021-10-01|fre|15:15|Labb     |XA3      |Ambulans|PWu       
pgk |2021-10-01|fre|15:15|Labb     |XA4      |Ambulans|FBe       
pgk |2021-10-06|ons|10:15|Resurstid|D1.01    |Falk    |PWu       
pgk |2021-10-06|ons|10:15|Resurstid|D1.02    |Gamma   |MBe       
pgk |2021-10-06|ons|10:15|Resurstid|D1.03    |Hacke   |ELu       
pgk |2021-10-06|ons|10:15|Resurstid|D1.04    |Panter  |EBe       
pgk |2021-10-06|ons|10:15|Resurstid|TFRD48.01|Varg    |NSa       
pgk |2021-10-06|ons|10:15|Resurstid|XA1      |Ambulans|AGr       
pgk |2021-10-06|ons|10:15|Resurstid|XA2      |Ambulans|FBe       
pgk |2021-10-06|ons|13:15|Resurstid|D1.09    |Falk    |SAl       
pgk |2021-10-06|ons|13:15|Resurstid|D1.10    |Gamma   |EBe       
pgk |2021-10-06|ons|13:15|Resurstid|D1.11    |Hacke   |EKr       
pgk |2021-10-06|ons|13:15|Resurstid|TFRD48.02|Panter  |ECe       
pgk |2021-10-06|ons|13:15|Resurstid|W3.a     |Val     |FBe       
pgk |2021-10-06|ons|13:15|Resurstid|XA1      |Ambulans|PWu       
pgk |2021-10-06|ons|13:15|Resurstid|XA2      |Ambulans|JSw       
pgk |2021-10-06|ons|15:15|Resurstid|D1.05    |Gamma   |LAl       
pgk |2021-10-06|ons|15:15|Resurstid|D1.06    |Hacke   |AJo       
pgk |2021-10-06|ons|15:15|Resurstid|D1.07    |Jupiter |MSv       
pgk |2021-10-06|ons|15:15|Resurstid|D1.08    |Mars    |JSw       
pgk |2021-10-06|ons|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-10-06|ons|15:15|Resurstid|XA2      |Ambulans|AGr       
pgk |2021-10-07|tor|08:15|Resurstid|C1.04    |Falk    |NCe       
pgk |2021-10-07|tor|08:15|Resurstid|C1.05    |Jupiter |EKr       
pgk |2021-10-07|tor|08:15|Resurstid|C1.06    |Val     |JTh       
pgk |2021-10-07|tor|08:15|Resurstid|XA1      |Ambulans|PGy       
pgk |2021-10-07|tor|08:15|Resurstid|XA2      |Ambulans|DHe       
pgk |2021-10-07|tor|10:15|Resurstid|D1.12    |Falk    |AGr       
pgk |2021-10-07|tor|10:15|Resurstid|D1.13    |Hacke   |MKu       
pgk |2021-10-07|tor|10:15|Resurstid|D1.14    |Panter  |APh       
pgk |2021-10-07|tor|10:15|Resurstid|XA1      |Ambulans|DHe       
pgk |2021-10-07|tor|10:15|Resurstid|XA2      |Ambulans|EBe       
pgk |2021-10-07|tor|15:15|Resurstid|C1.01    |Alfa    |TLu       
pgk |2021-10-07|tor|15:15|Resurstid|C1.02    |Beta    |PSa       
pgk |2021-10-07|tor|15:15|Resurstid|C1.03    |Elg     |ESt       
pgk |2021-10-07|tor|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-10-07|tor|15:15|Resurstid|XA2      |Ambulans|AGr       
pgk |2021-10-08|fre|10:15|Labb     |C1.03    |Elg     |ESt       
pgk |2021-10-08|fre|10:15|Labb     |C1.04    |Falk    |NCe       
pgk |2021-10-08|fre|10:15|Labb     |D1.11    |Gamma   |DHe       
pgk |2021-10-08|fre|10:15|Labb     |D1.12    |Hacke   |PGy       
pgk |2021-10-08|fre|10:15|Labb     |D1.13    |Jupiter |MKu       
pgk |2021-10-08|fre|10:15|Labb     |D1.14    |Mars    |APh       
pgk |2021-10-08|fre|10:15|Labb     |TFRD48.01|Panter  |NSa       
pgk |2021-10-08|fre|10:15|Labb     |TFRD48.02|Val     |ECe       
pgk |2021-10-08|fre|10:15|Labb     |XA1      |Ambulans|PWu       
pgk |2021-10-08|fre|10:15|Labb     |XA2      |Ambulans|FBe       
pgk |2021-10-08|fre|10:15|Labb     |XA3      |Ambulans|EKr       
pgk |2021-10-08|fre|10:15|Labb     |XA4      |Ambulans|MSv       
pgk |2021-10-08|fre|13:15|Labb     |C1.01    |Elg     |TLu       
pgk |2021-10-08|fre|13:15|Labb     |C1.02    |Falk    |PSa       
pgk |2021-10-08|fre|13:15|Labb     |D1.01    |Gamma   |PWu       
pgk |2021-10-08|fre|13:15|Labb     |D1.02    |Hacke   |MBe       
pgk |2021-10-08|fre|13:15|Labb     |D1.03    |Jupiter |ELu       
pgk |2021-10-08|fre|13:15|Labb     |D1.04    |Mars    |EBe       
pgk |2021-10-08|fre|13:15|Labb     |D1.05    |Panter  |LAl       
pgk |2021-10-08|fre|13:15|Labb     |W3.a     |Venus   |FBe       
pgk |2021-10-08|fre|13:15|Labb     |XA1      |Ambulans|AGr       
pgk |2021-10-08|fre|13:15|Labb     |XA2      |Ambulans|FKa       
pgk |2021-10-08|fre|13:15|Labb     |XA3      |Ambulans|EKr       
pgk |2021-10-08|fre|13:15|Labb     |XA4      |Ambulans|DHe       
pgk |2021-10-08|fre|15:15|Labb     |C1.05    |Alfa    |EKr       
pgk |2021-10-08|fre|15:15|Labb     |C1.06    |Beta    |JTh       
pgk |2021-10-08|fre|15:15|Labb     |D1.06    |Gamma   |AJo       
pgk |2021-10-08|fre|15:15|Labb     |D1.07    |Hacke   |MSv       
pgk |2021-10-08|fre|15:15|Labb     |D1.08    |Jupiter |JSw       
pgk |2021-10-08|fre|15:15|Labb     |D1.09    |Mars    |SAl       
pgk |2021-10-08|fre|15:15|Labb     |D1.10    |Panter  |EBe       
pgk |2021-10-08|fre|15:15|Labb     |XA1      |Ambulans|EJa       
pgk |2021-10-08|fre|15:15|Labb     |XA2      |Ambulans|AGr       
pgk |2021-10-08|fre|15:15|Labb     |XA3      |Ambulans|FKa       
pgk |2021-10-08|fre|15:15|Labb     |XA4      |Ambulans|EBe       
pgk |2021-10-13|ons|10:15|Resurstid|D1.01    |Falk    |PWu       
pgk |2021-10-13|ons|10:15|Resurstid|D1.02    |Gamma   |MBe       
pgk |2021-10-13|ons|10:15|Resurstid|D1.03    |Hacke   |ELu       
pgk |2021-10-13|ons|10:15|Resurstid|D1.04    |Panter  |EBe       
pgk |2021-10-13|ons|10:15|Resurstid|TFRD48.01|Varg    |NSa       
pgk |2021-10-13|ons|10:15|Resurstid|XA1      |Ambulans|AGr       
pgk |2021-10-13|ons|10:15|Resurstid|XA2      |Ambulans|FBe       
pgk |2021-10-13|ons|13:15|Resurstid|D1.09    |Falk    |SAl       
pgk |2021-10-13|ons|13:15|Resurstid|D1.10    |Gamma   |EBe       
pgk |2021-10-13|ons|13:15|Resurstid|D1.11    |Hacke   |EKr       
pgk |2021-10-13|ons|13:15|Resurstid|TFRD48.02|Panter  |ECe       
pgk |2021-10-13|ons|13:15|Resurstid|W3.a     |Val     |FBe       
pgk |2021-10-13|ons|13:15|Resurstid|XA1      |Ambulans|PWu       
pgk |2021-10-13|ons|13:15|Resurstid|XA2      |Ambulans|JSw       
pgk |2021-10-13|ons|15:15|Resurstid|D1.05    |Gamma   |LAl       
pgk |2021-10-13|ons|15:15|Resurstid|D1.06    |Hacke   |AJo       
pgk |2021-10-13|ons|15:15|Resurstid|D1.07    |Jupiter |MSv       
pgk |2021-10-13|ons|15:15|Resurstid|D1.08    |Mars    |JSw       
pgk |2021-10-13|ons|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-10-13|ons|15:15|Resurstid|XA2      |Ambulans|APh       
pgk |2021-10-14|tor|08:15|Resurstid|C1.04    |Falk    |NCe       
pgk |2021-10-14|tor|08:15|Resurstid|C1.05    |Jupiter |EKr       
pgk |2021-10-14|tor|08:15|Resurstid|C1.06    |Val     |JTh       
pgk |2021-10-14|tor|08:15|Resurstid|XA1      |Ambulans|FBe       
pgk |2021-10-14|tor|08:15|Resurstid|XA2      |Ambulans|PWu       
pgk |2021-10-14|tor|10:15|Resurstid|D1.12    |Falk    |AGr       
pgk |2021-10-14|tor|10:15|Resurstid|D1.13    |Hacke   |EKr       
pgk |2021-10-14|tor|10:15|Resurstid|D1.14    |Panter  |FBe       
pgk |2021-10-14|tor|10:15|Resurstid|XA1      |Ambulans|EBe       
pgk |2021-10-14|tor|10:15|Resurstid|XA2      |Ambulans|SAl       
pgk |2021-10-14|tor|15:15|Resurstid|C1.01    |Alfa    |TLu       
pgk |2021-10-14|tor|15:15|Resurstid|C1.02    |Beta    |PSa       
pgk |2021-10-14|tor|15:15|Resurstid|C1.03    |Elg     |ESt       
pgk |2021-10-14|tor|15:15|Resurstid|XA1      |Ambulans|FKa       
pgk |2021-10-14|tor|15:15|Resurstid|XA2      |Ambulans|DHe       
pgk |2021-10-15|fre|10:15|Labb     |C1.03    |Elg     |ESt       
pgk |2021-10-15|fre|10:15|Labb     |C1.04    |Falk    |NCe       
pgk |2021-10-15|fre|10:15|Labb     |D1.11    |Gamma   |DHe       
pgk |2021-10-15|fre|10:15|Labb     |D1.12    |Hacke   |PGy       
pgk |2021-10-15|fre|10:15|Labb     |D1.13    |Jupiter |MKu       
pgk |2021-10-15|fre|10:15|Labb     |D1.14    |Mars    |APh       
pgk |2021-10-15|fre|10:15|Labb     |TFRD48.01|Panter  |NSa       
pgk |2021-10-15|fre|10:15|Labb     |TFRD48.02|Saturnus|ECe       
pgk |2021-10-15|fre|10:15|Labb     |XA1      |Ambulans|EBe       
pgk |2021-10-15|fre|10:15|Labb     |XA2      |Ambulans|EBe       
pgk |2021-10-15|fre|10:15|Labb     |XA3      |Ambulans|PWu       
pgk |2021-10-15|fre|10:15|Labb     |XA4      |Ambulans|FBe       
pgk |2021-10-15|fre|13:15|Labb     |C1.01    |Elg     |TLu       
pgk |2021-10-15|fre|13:15|Labb     |C1.02    |Falk    |PSa       
pgk |2021-10-15|fre|13:15|Labb     |D1.01    |Gamma   |PWu       
pgk |2021-10-15|fre|13:15|Labb     |D1.02    |Hacke   |MBe       
pgk |2021-10-15|fre|13:15|Labb     |D1.03    |Jupiter |ELu       
pgk |2021-10-15|fre|13:15|Labb     |D1.04    |Mars    |FKa       
pgk |2021-10-15|fre|13:15|Labb     |D1.05    |Panter  |LAl       
pgk |2021-10-15|fre|13:15|Labb     |W3.a     |Venus   |FBe       
pgk |2021-10-15|fre|13:15|Labb     |XA1      |Ambulans|EKr       
pgk |2021-10-15|fre|13:15|Labb     |XA2      |Ambulans|DHe       
pgk |2021-10-15|fre|13:15|Labb     |XA3      |Ambulans|NCe       
pgk |2021-10-15|fre|13:15|Labb     |XA4      |Ambulans|AJo       
pgk |2021-10-15|fre|15:15|Labb     |C1.05    |Alfa    |EKr       
pgk |2021-10-15|fre|15:15|Labb     |C1.06    |Beta    |JTh       
pgk |2021-10-15|fre|15:15|Labb     |D1.06    |Gamma   |AJo       
pgk |2021-10-15|fre|15:15|Labb     |D1.07    |Hacke   |MSv       
pgk |2021-10-15|fre|15:15|Labb     |D1.08    |Jupiter |JSw       
pgk |2021-10-15|fre|15:15|Labb     |D1.09    |Mars    |SAl       
pgk |2021-10-15|fre|15:15|Labb     |D1.10    |Panter  |EBe       
pgk |2021-10-15|fre|15:15|Labb     |XA1      |Ambulans|EJa       
pgk |2021-10-15|fre|15:15|Labb     |XA2      |Ambulans|FKa       
pgk |2021-10-15|fre|15:15|Labb     |XA3      |Ambulans|EBe       
pgk |2021-10-15|fre|15:15|Labb     |XA4      |Ambulans|PWu       
""".trim.split('\n').toSeq
