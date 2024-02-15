{
    'name': 'Citas',
    'version': '1.0.0',
    'author': 'SantyVC',
    'maintainer': 'SantyVC',
    'website': 'www.google.com',
    'license': 'AGPL-3',
    'category': 'Extra Tools',
    'summary': 'Short summary.',
    'depends': ['base'],
    'security': [
        'security/ir.model.access.csv',
        'security/cita_security.xml',
        'security/cita_security.csv',
        'security/medico_security.xml',
        'security/medico_security.csv',
        'security/paciente_security.xml',
        'security/paciente_security.csv'

    ],
    'data':{
        'view/view.xml'
    },
    'application': True,
    'instalabre': True,
    'auto_install': False,
    'images' :{
        'static/1.png'
        'static/2.png'
        'static/3.png'
    }

}
