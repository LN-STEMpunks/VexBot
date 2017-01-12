import wpilib
from wpilib.joystick import Joystick

import math

class Controller(Joystick):

    def _pow_scale(val, pw=2.5):
        _abs_v = abs(val)
        _sgn_v = (1 if val > 0 else 0)
        return _sgn_v * (_abs_v ** pw)

    def _exp_scale(val, base=2**5):
        _abs_v = abs(val)
        _sgn_v = (1 if val > 0 else 0)
        return _sgn_v * ((base**_abs_v-1)/(base-1))

    def getAxis(self, id):
        return Controller._pow_scale(self.getRawAxis(id))


