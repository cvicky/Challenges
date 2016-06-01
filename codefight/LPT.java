//2sigma

int[][] serverFarm(int[] jobs, int servers) {
    
    //given int array of jobs, sort them in highest to lowest order
    Arrays.sort(jobs);
    for(int i =jobs.length-1; i>-1; i--)
        System.out.println(jobs[i]);
    
    //go through job array and through servers
    ArrayList<Integer> serverQ = new ArrayList<Integer>();
    //add in the server values from input
    for(int i=0; i<servers; i++)
        serverQ.add(i);
    
    for(int i=0; i<servers; i++)
        System.out.println(serverQ.get(i) );
    
    //initiate the serverFarm
    int[][] serverFarm = {{}};
    
    //assign jobs to servers
    int jobIndex = 0;
    int serverIndex = 0;
    while(jobIndex != jobs.length){
        serverFarm[serverQ.get(i)][0] = 
    
        //go to next job
        jobIndex++;   
    }
    
    
    return serverFarm;
    //want to use a queue for the servers, first available is first assigned
    //output is array of arrays
    
}
