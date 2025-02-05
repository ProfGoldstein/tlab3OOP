#!/bin/bash
#SBATCH --job-name=yourname_lab3_job    # Job name
#SBATCH --mail-type=ALL          # Mail events (NONE, BEGIN, END, FAIL, ALL)
#SBATCH --mail-user=you@siena.edu     # Where to send mail
#SBATCH --output=lab3_%j.log   # Standard output and error log
#SBATCH --nodes=4
#SBATCH --partition=short
#SBATCH --ntasks=4

sleep 10        # a short pause so you can see your job in the queue

module load gnu9
module load RYAN/openmpi-5.0.6
mpirun java -cp . ComputePi
