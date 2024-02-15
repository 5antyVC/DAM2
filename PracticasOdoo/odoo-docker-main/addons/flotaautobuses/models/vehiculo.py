from odoo import models, fields

class Vehiculo(models.Models):

    _name= "flotaautobuses.vehiculo"
    _description = "Tabla vehiculo"

    Capaidad = fields.Char(int="Capacidad")
    Matricula = fields.char(string = "Matricula")
    Conductor = fields.Many2One(flotaautobuses.conductor,string="Conductor")

