package loea.sched.task;

import java.io.Serializable;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.UtilizationModelFull;

public class SubTask extends Cloudlet implements Serializable {

	private static final long DEFAULTFILESIZE = 100;
	private static final int DEFAULTPESNUMBER = 1;
	private static final UtilizationModel DEFAULTUTILIZATIONMODEL = new UtilizationModelFull();

	/**
	 * 
	 */
	private static final long serialVersionUID = 3639372534306437425L;

	public SubTask(int cloudletId, long cloudletLength, int pesNumber,
			long cloudletFileSize, long cloudletOutputSize,
			UtilizationModel utilizationModelCpu,
			UtilizationModel utilizationModelRam,
			UtilizationModel utilizationModelBw) {
		super(cloudletId, cloudletLength, pesNumber, cloudletFileSize,
				cloudletOutputSize, utilizationModelCpu, utilizationModelRam,
				utilizationModelBw);
		// TODO Auto-generated constructor stub
	}

	public SubTask(int cloudletId, long cloudletLength) {
		super(cloudletId, cloudletLength, DEFAULTPESNUMBER, DEFAULTFILESIZE,
				DEFAULTFILESIZE, DEFAULTUTILIZATIONMODEL,
				DEFAULTUTILIZATIONMODEL, DEFAULTUTILIZATIONMODEL);

	}

	public SubTask() {
		this(0, 0);
	}

}