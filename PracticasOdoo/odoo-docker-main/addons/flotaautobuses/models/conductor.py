from odoo import models, fields

class Conductor(models.Models):

    _name= "flotaautobuses.conductor"
    _description = "Tabla conductor"

    DNI_Pasaporte = fields.char(string="DNI/Pasaporte")
    Licencia_Conduccion = fields.char(string = "Licencia de Conduccion")
    Vehiculos = fields.Many2One(flotaautobuses.vehiculo,string="Vehiculos")
    Viajes = fields.Many2One(flotaautobuses.viaje,string="Viajes")

