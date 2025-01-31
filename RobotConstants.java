package frc.robot.robot_specific;

import static edu.wpi.first.units.Units.Rotations;

import com.ctre.phoenix6.configs.Slot0Configs;

import edu.wpi.first.units.measure.Angle;

public class RobotConstants {
    public class Options {
        public static final boolean CENTER_CAMERA = false;
    }

    public class EnabledSubsystems {
        public static final boolean ELEVATOR_ENABLED = true;
        public static final boolean JAWS_ENABLED = false;
        public static final boolean TUSKS_ENABLED = false;
    }

    public class DriveConstants {
        public static final Slot0Configs DRIVE_GAINS = new Slot0Configs()
                .withKP(0.1).withKI(0).withKD(0)
                .withKS(0.1566).withKV(2.3096).withKA(0.0232);

        public static final Angle FRONT_LEFT_ENCODER_OFFSET = Rotations.of(0.27392578125);
        public static final Angle FRONT_RIGHT_ENCODER_OFFSET = Rotations.of(0.237548828125);
        public static final Angle BACK_LEFT_ENCODER_OFFSET = Rotations.of(-0.123779296875);
        public static final Angle BACK_RIGHT_ENCODER_OFFSET = Rotations.of(0.44580078125);

    }
}
