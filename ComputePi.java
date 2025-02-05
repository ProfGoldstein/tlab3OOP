import mpi.*;
/** 
 * 
 * Lab 3
 * Main class for demonstrating parallel processing to compute pi
 *
 * @author Ira Goldstein
 * @version 3-Feb-2025
 *
 **/
class ComputePi {
    /**
     * Main method for demonstrating parallel processing to compute pi
     *
     * @param args Command line arguments (not used).
     *
     */
   public static void main(String args[]) throws MPIException {

       // Initialize the MPI environment	
       MPI.Init(args);

       // Get the process ID (rank) and the total number of processes (size)
       int rank = MPI.COMM_WORLD.getRank(),
           size = MPI.COMM_WORLD.getSize(),
           nint = 200; // Intervals.
       double h = 1.0/(double)nint, sum = 0.0;

       // Calculate Pi using partial sums
       for (int i=rank+1; i<=nint; i+=size) {
           double x = h * ((double)i - 0.5);
           sum += (4.0 / (1.0 + x * x));
       }

       double sBuf[] = { h * sum },
              rBuf[] = new double[1];

       // Sum up the results from the various processes
       MPI.COMM_WORLD.reduce(sBuf, rBuf, 1, MPI.DOUBLE, MPI.SUM, 0);

       if (rank == 0) {
           System.out.println("PI: " + rBuf[0]);
       }
       MPI.Finalize();
   }
}
