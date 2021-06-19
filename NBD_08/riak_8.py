import riak

BUCKET_NAME = 's15799_nbd8'
OBJECT_KEY = 'car100'

'''
used riak python client is compatible with python 2.7 and python3 < 3.7 
project is using virtual env with python 2.7 interpreter
'''


def add_object(bucket):
    doc_value = {
        'brand': 'Volvo',
        'model': 'XC60',
        'mileage': 50000
    }
    key = bucket.new(OBJECT_KEY, data=doc_value)
    key.store()


def get_object(bucket):
    return bucket.get(OBJECT_KEY)


def update_object(fetched_obj):
    fetched_obj.data['mileage'] = 100000
    fetched_obj.store()


def delete_object(fetched_obj):
    fetched_obj.delete()


def __main__():
    print('Start NBD_8')
    riak_client = riak.RiakClient(pb_port=8087, protocol='pbc')
    bucket = riak_client.bucket(BUCKET_NAME)

    add_object(bucket)
    print('1) Add object completed')

    fetched_obj = get_object(bucket)
    print('2) Get object completed with res: {}'.format(fetched_obj.data))

    update_object(fetched_obj)
    print('3) Update object completed')

    fetched_obj = get_object(bucket)
    print('4) Get object completed with res: {}'.format(fetched_obj.data))

    delete_object(fetched_obj)
    print('5) Delete object completed')

    fetched_obj = get_object(bucket)
    print('6) Get object completed with res: {}'.format(fetched_obj.data))

    print('7) Is object exists in DB: {}'.format(fetched_obj.exists))

    print('End NBD_8')


__main__()
