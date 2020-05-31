token-spring-boot-starter
Get token information through public key ,

Use like this:

1.You need to set your own public key and install it,

2.pom.xml


        <dependency>
            <groupId>com.heshicaihao</groupId>
            <artifactId>token-spring-boot-starter</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
		
		
		
3.class.java


    @Autowired
    private TokenDecode tokenDecode;
	
	
    /***
     * public key
     * @return 
     */
	tokenDecode.getPubKey();
	
    /***
     * User name
     * @return 
     */	
	tokenDecode.getUsername();
	
    /***
     * User information
     * @return 
     */	
	tokenDecode.getUserInfo();
		


