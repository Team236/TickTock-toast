package frc.team236.ticktock;

import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;

public class RobotModule extends IterativeModule {

	public static Logger logger;

	@Override
	public String getModuleName() {
		return "TickTock";
	}

	@Override
	public String getModuleVersion() {
		return "1.0.0";
	}

	@Override
	public void robotInit() {
		logger = new Logger("TickTock", Logger.ATTR_DEFAULT);
		//TODO: Module Init
	}
}
