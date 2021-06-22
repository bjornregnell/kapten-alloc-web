val testRows: Seq[String] = """
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
kurs|datum     |start|typ      |lokal                                                                   |grupp                                                                       
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
pgk |2021-09-01|10:00|Resurstid|E:Falk, E:Gamma, E:Hacke, E:Panter, E:Varg                              |D1.01, D1.02, D1.03, D1.04, TFRD48.01                                       
pgk |2021-09-01|13:00|Resurstid|E:Falk, E:Gamma, E:Hacke, E:Panter, E:Val                               |D1.09, D1.10, D1.11, TFRD48.02, W3.a                                        
pgk |2021-09-01|15:00|Resurstid|E:Gamma, E:Hacke, E:Jupiter, E:Mars, E:Panter                           |D1.05, D1.06, D1.07, D1.08, W3.b                                            
pgk |2021-09-02|08:00|Resurstid|E:Falk, E:Jupiter, E:Val                                                |C1.04, C1.05, C1.06                                                         
pgk |2021-09-02|10:00|Resurstid|E:Falk, E:Hacke, E:Panter                                               |D1.12, D1.13, D1.14                                                         
dod |2021-09-02|13:00|Datorlabb|E:Beta, E:Falk, E:Gamma, E:Hacke, E:Panter, E:Varg                      |C1.01, C1.02, C1.03, D1.08, D1.09, D1.10                                    
pgk |2021-09-02|15:00|Resurstid|E:Beta, E:Gamma, E:Venus                                                |C1.01, C1.02, C1.03                                                         
dod |2021-09-02|15:00|Datorlabb|E:Falk, E:Hacke, E:Mars, E:Panter, E:Val, E:Varg                        |C1.04, D1.01, D1.02, D1.03, C1.05, C1.06                                    
pgk |2021-09-03|10:00|Labb     |E:Elg, E:Falk, E:Gamma, E:Hacke, E:Jupiter, E:Mars, E:Panter, E:Val     |C1.03, C1.04, D1.11, D1.12, D1.13, D1.14, TFRD48.01, TFRD48.02              
pgk |2021-09-03|13:00|Labb     |E:Elg, E:Falk, E:Gamma, E:Hacke, E:Jupiter, E:Mars, E:Panter, E:Venus   |C1.01, C1.02, D1.01, D1.02, D1.03, D1.04, D1.05, W3.a                       
pgk |2021-09-03|15:00|Labb     |E:Alfa, E:Beta, E:Gamma, E:Hacke, E:Jupiter, E:Mars, E:Panter, E:Val    |D1.06, D1.07, D1.08, D1.09, D1.10, C1.05, C1.06, W3.b     
""".trim.split('\n').toSeq
