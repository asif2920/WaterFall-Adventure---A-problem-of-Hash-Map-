# WaterFall Adventure ( A problem of Hash Map)

Very basic operations of hash map are expected in this problem.

Problem: You are asked to take input from a .txt file. The file contains 

Sequence_Number  Name Location Distance                                                                                                           
1 Bow_Falls Banff 200                                                                                                                   
2 Troll_Falls Kananaskis 150                                                                                                             
3 Johnston_Canyon Banff 195
4 Bow_Glacier_Falls Jasper 250                                                                                                                   
5 Tangle_Creek Jasper 275                                                                                                                           
6 Malign_Canyon Jasper 310                                                                                                                           
7 Athabaska_Falls Jasper 300                                                                                                                    
8 Sunwapta_Falls Jasper 350                                                                                                                        
9 Takakhawa_Falls Yoho_National_Park 320                                                                                                       
10 Wapta_Falls Yoho_National_Park 375                                                                                                            
11 Sutherland_Falls Revelstoke 490                                                                                                              
12 Moses_Falls Revelstoke 470                                                                                                                         
13 Begbie_Falls Revelstoke 490                                                                                                                    
14 Shanon_falls Whistler(BC) 1105                                                                                                                 
15 Virginia_Falls Montana 1000                                                                                                                       
16 Saint_Mary_Falls Montana 1020                                                                                                             
17 Ceader_Terrace Montana 1100                                                                                                                       

Entry of the file is space seperated. Name, Location and Distance are attributes of a class called Location.
You are asked to read from the above mentioned file and declare a hashmap which uses the sequence_number as the key and Location class as it's value. Later you are asked to display all the elements of the hash map.
In another task, you are asked to generate a random integer number and delete the number from the hash map if it matches with randomy generated number and later display the updated hash map value.

Sample Output:                                                                                                                                                 
1. Task 1:

1 Bow_Falls Banff 200                                                                                                                                    
2 Troll_Falls Kananaskis 150                                                                                                                          
3 Johnston_Canyon Banff 195                                                                                                                              
4 Bow_Glacier_Falls Jasper 250                                                                                                                      
5 Tangle_Creek Jasper 275                                                                                                                                                 
6 Malign_Canyon Jasper 310                                                                                                                                                        
7 Athabaska_Falls Jasper 300                                                                                                                                                    
8 Sunwapta_Falls Jasper 350                                                                                                                                                   
9 Takakhawa_Falls Yoho_National_Park 320                                                                                                                                        
10 Wapta_Falls Yoho_National_Park 375                                                                                                                                                   
11 Sutherland_Falls Revelstoke 490                                                                                                                                                      
12 Moses_Falls Revelstoke 470                                                                                                                                                   
13 Begbie_Falls Revelstoke 490                                                                                                                                                                
14 Shanon_falls Whistler(BC) 1105                                                                                                                                             
15 Virginia_Falls Montana 1000                                                                                                                                                  
16 Saint_Mary_Falls Montana 1020                                                                                                                                    
17 Ceader_Terrace Montana 1100

2. Task 2: 
Random Number: 5
Deleted Key is: 5
After the deletion, results are: 
1 Bow_Falls Banff 200                                                                                                                                    
2 Troll_Falls Kananaskis 150                                                                                                                          
3 Johnston_Canyon Banff 195                                                                                                                              
4 Bow_Glacier_Falls Jasper 250                                                                                                                                                                                                                                                      
6 Malign_Canyon Jasper 310                                                                                                                                                        
7 Athabaska_Falls Jasper 300                                                                                                                                                    
8 Sunwapta_Falls Jasper 350                                                                                                                                                   
9 Takakhawa_Falls Yoho_National_Park 320                                                                                                                                        
10 Wapta_Falls Yoho_National_Park 375                                                                                                                                                   
11 Sutherland_Falls Revelstoke 490                                                                                                                                                      
12 Moses_Falls Revelstoke 470                                                                                                                                                   
13 Begbie_Falls Revelstoke 490                                                                                                                                                                
14 Shanon_falls Whistler(BC) 1105                                                                                                                                             
15 Virginia_Falls Montana 1000                                                                                                                                                  
16 Saint_Mary_Falls Montana 1020                                                                                                                                    
17 Ceader_Terrace Montana 1100
